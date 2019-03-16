package surfer.example.surfer.robobore;

import android.arch.core.executor.DefaultTaskExecutor;
import android.content.Intent;
import android.net.NetworkInfo;
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

public class RoboRash extends AppCompatActivity {
Button button;
ImageView imageView;
TextView textView,textView1;
DatabaseReference databaseReference;
  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo_rash);
        Button button1=findViewById(R.id.button1);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(RoboRash.this,Robotics.class);
                startActivity(back);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://drive.google.com/file/d/1O-yOkOvHSpoG7V6R9fvnzIUyAteus71o/view?usp=sharing"));
                startActivity(browse);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfeJZ7aO4eo3FzkTV6EI5Byc993o1VYSefmoEXSQVwTjLmAjA/viewform?usp=pp_url"));
                startActivity(browse);
                finish();
            }
        });
        textView=findViewById(R.id.text1);

        databaseReference =FirebaseDatabase.getInstance().getReference().child("roborash");
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
