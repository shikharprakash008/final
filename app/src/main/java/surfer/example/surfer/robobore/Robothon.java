package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Robothon extends AppCompatActivity {
Button button;
ImageView imageView;
TextView tv,textView1;
DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robothon);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);
        tv=findViewById(R.id.tv);
        textView1=findViewById(R.id.text5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Robothon.this,Hackathon.class);
                startActivity(i);
                finish();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent (Robothon.this,Events.class);
                startActivity(back);
                finish();
            }
        });
        Button button1=findViewById(R.id.text3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://drive.google.com/file/d/16SqBxIS2hBgFrhBZu6Q1kYUrtFrbZ0RG/view?usp=sharing"));
                startActivity(browse);
            }
        });

       // tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //tv.setSingleLine(true);
        //tv.setSelected(true);
        //tv.setHorizontallyScrolling(true);
        //tv.setMarqueeRepeatLimit(-1);
        //tv.setFocusable(true);
        //tv.setFocusableInTouchMode(true);
        tv.setSelected(true);


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
