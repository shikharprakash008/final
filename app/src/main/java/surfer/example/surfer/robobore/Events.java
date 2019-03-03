package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.Inet4Address;

import de.hdodenhof.circleimageview.CircleImageView;

public class Events extends AppCompatActivity {
ImageView imageView;
CircleImageView circleImageView,circleImageView2;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        imageView=findViewById(R.id.imageView4);
        circleImageView=findViewById(R.id.image1);
        circleImageView2=findViewById(R.id.image2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back= new Intent(Events.this,MainActivity.class);
                startActivity(back);
            }
        });
        circleImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hack= new Intent(Events.this,Robotics.class);
                startActivity(hack);
            }
        });
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robotics = new Intent(Events.this,Robotics.class);
                startActivity(robotics);
            }
        });
    }
}
