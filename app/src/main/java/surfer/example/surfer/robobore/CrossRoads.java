package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CrossRoads extends AppCompatActivity {
Button button;
ImageView imageView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_roads);

        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);
        button.setOnClickListener(new View.OnClickListener() {
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
                finish();
            }
        });
    }


}
