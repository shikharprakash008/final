package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        //Intent i=getIntent();
        //TextView prob_state=(TextView)findViewById(R.id.prob_name);
        //TextView prob_desc=(TextView)findViewById(R.id.prob_desc);
        //String my="eye";
       // String prob1=i.getStringExtra("prob1");
        DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width =dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int) (width*.8),(int) (height*.6));
        //prob_state.setText(my);
        //if(prob1.equals(my))
        //{
         //   prob_state.setText("CORSIY");
          //  prob_desc.setText("ELLO");
        //}
    }
}
