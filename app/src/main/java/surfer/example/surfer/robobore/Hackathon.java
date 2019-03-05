package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.InvalidMarkException;
import java.nio.channels.InterruptedByTimeoutException;

public class Hackathon extends AppCompatActivity {
ImageView imageView,imageView1,imageView2,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;
ImageView imageView11,imageView12,imageView13,imageView14,imageView16,imageView15,imageView17,imageView18,imageView19,imageView20,imageView21;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathon);
        final TextView prob1=(TextView)findViewById(R.id.prob1);
        imageView=findViewById(R.id.imageView4);
        imageView1=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image2);
        imageView4=findViewById(R.id.image4);
        imageView5=findViewById(R.id.image5);
        imageView6=findViewById(R.id.image6);
        imageView7=findViewById(R.id.image7);
        imageView8=findViewById(R.id.image8);
        imageView9=findViewById(R.id.image9);
        imageView10=findViewById(R.id.image10);
        imageView11=findViewById(R.id.image11);
        imageView12=findViewById(R.id.image12);
        imageView13=findViewById(R.id.image13);
        imageView14=findViewById(R.id.image14);
        imageView15=findViewById(R.id.image15);
        imageView16=findViewById(R.id.image16);
        imageView17=findViewById(R.id.image17);
        imageView18=findViewById(R.id.image18);
        imageView19=findViewById(R.id.image19);
        imageView20=findViewById(R.id.image20);
        imageView21=findViewById(R.id.image21);




        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Hackathon.this,Events.class);
            startActivity(i);
                finish();
            }

        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent pop =new Intent(Hackathon.this,Pop.class);
                getIntent().putExtra("prob1",prob1.getText().toString());
             startActivity(pop);
                finish();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob2.class);
                startActivity(pop);
                finish();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob3.class);
                startActivity(pop);finish();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob4.class);
                startActivity(pop);
                finish();
            }
        });imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob5.class);
                startActivity(pop);
                finish();
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob6.class);
                startActivity(pop);
                finish();
            }
        });imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob7.class);
                startActivity(pop);
                finish();
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob8.class);
                startActivity(pop);
                finish();
            }
        });imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob9.class);
                startActivity(pop);
                finish();
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,prob10.class);
                startActivity(pop);
                finish();
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,PowEleven.class);
                startActivity(pop);
                finish();
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,PopTweleve.class);
                startActivity(pop);
                finish();
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Popthirteen.class);
                startActivity(pop);
                finish();
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop14.class);
                startActivity(pop);
                finish();
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop15.class);
                startActivity(pop);
                finish();
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop16.class);
                startActivity(pop);
                finish();
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop17.class);
                startActivity(pop);
                finish();
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop18.class);
                startActivity(pop);
                finish();
            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop19.class);
                startActivity(pop);
                finish();
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop =new Intent(Hackathon.this,Pop20.class);
                startActivity(pop);
                finish();
            }
        });



    }
}
