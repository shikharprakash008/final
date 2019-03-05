package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dcode extends AppCompatActivity {
ImageView imageView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcode);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://drive.google.com/file/d/1WTCbJKK7HWHZk3ZzZ8PJJoro45PJ-u40/view?usp=sharing"));
                startActivity(browse);

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back=new Intent(Dcode.this,Robotics.class);
                startActivity(back);
                //finish();
            }
        });

        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScSzRAauM6GVHGRT-KWq3WUw6MX4Q895InFBHDG9aom4blf2Q/viewform?usp=pp_url"));
                startActivity(browse);
            }
        });


    }
}
