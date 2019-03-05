package surfer.example.surfer.robobore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class Pop14 extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop14);
        button=findViewById(R.id.button);
        DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);


        int width =dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int) (width*.8),(int) (height*.6));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW);
                browse.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd6DGBoUf-t_AFjx-JCXBGbB--ZwjySlZPm0JBGg3X2nM4SAQ/viewform?usp=pp_url"));
                startActivity(browse);
            }
        });
    }
}
