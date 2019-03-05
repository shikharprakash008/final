package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RoboRash extends AppCompatActivity {
Button button;
ImageView imageView;
    Button button1=findViewById(R.id.button1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo_rash);

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
                browse.setData(Uri.parse("https://drive.google.com/file/d/1WTCbJKK7HWHZk3ZzZ8PJJoro45PJ-u40/view?usp=sharing"));
                startActivity(browse);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfeJZ7aO4eo3FzkTV6EI5Byc993o1VYSefmoEXSQVwTjLmAjA/viewform?usp=pp_url"));
                startActivity(browse);
            }
        });
    }

}
