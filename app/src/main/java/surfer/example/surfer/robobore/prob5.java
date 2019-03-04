package surfer.example.surfer.robobore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class prob5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob5);
        DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width =dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int) (width*.8),(int) (height*.6));
    }
}
