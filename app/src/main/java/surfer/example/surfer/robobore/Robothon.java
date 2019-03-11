package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Robothon extends AppCompatActivity {
Button button;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robothon);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);
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
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSci_XNrkPl9w0ZPC0Mj2p-Q22AC-P8TdX24s8e8UJzLfvZ-Kg/viewform?usp=pp_url"));
                startActivity(browse);
            }
        });
    }
}
