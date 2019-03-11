package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CrossRoads extends AppCompatActivity {
Button button,button1;
ImageView imageView;
TextView textView,textView1;
DatabaseReference databaseReference;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_roads);

        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        imageView=findViewById(R.id.imageView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://drive.google.com/file/d/1WTCbJKK7HWHZk3ZzZ8PJJoro45PJ-u40/view?usp=sharing"));
                startActivity(browse);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSc67pN7FwTc3z_W_shNb7UJG2eCa61zAe3lYi63FqUbqOn7xQ/viewform?usp=pp_url"));
                startActivity(browse);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(CrossRoads.this,Robotics.class);
                startActivity(back);
                //finish();
            }
        });
        textView=findViewById(R.id.text1);

        databaseReference =FirebaseDatabase.getInstance().getReference().child("cross");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s = dataSnapshot.getValue().toString();
                textView.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        textView1=findViewById(R.id.text3);

        databaseReference =FirebaseDatabase.getInstance().getReference().child("register");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s = dataSnapshot.getValue().toString();
                textView1.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
