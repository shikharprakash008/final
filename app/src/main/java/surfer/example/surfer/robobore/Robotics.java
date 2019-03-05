package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Robotics extends AppCompatActivity {
ImageView imageView;
CircleImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotics);

        imageView=findViewById(R.id.imageView4);
        imageView1=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image11);
        imageView3=findViewById(R.id.image4);
        imageView4=findViewById(R.id.image5);
        imageView5=findViewById(R.id.image6);
        imageView6=findViewById(R.id.image7);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Robotics.this,CrossRoads.class);
                startActivity(r);
               // finish();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Robotics.this,RoboRash.class);
                startActivity(r);
                //finish();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Robotics.this,PaperPresenation.class);
                startActivity(r);
                //finish();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Robotics.this,RoboSoccer.class);
                startActivity(r);
                //finish();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Robotics.this,Dcode.class);
                startActivity(r);
               //finish();
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent line=new Intent(Robotics.this,LineFollower.class);
                startActivity(line);
               // finish();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Robotics.this,Events.class);
                startActivity(back);
               // finish();
            }
        });
    }
}
