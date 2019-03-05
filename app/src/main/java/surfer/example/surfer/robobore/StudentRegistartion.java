package surfer.example.surfer.robobore;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import surfer.example.surfer.robobore.Model.Register;

public class StudentRegistartion extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference team;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registartion);
        editText1= findViewById(R.id.edi1);
        editText2=findViewById(R.id.edi2);
        editText3=findViewById(R.id.edi3);
        editText4=findViewById(R.id.edi4);
        editText5=findViewById(R.id.edi5);
        editText6=findViewById(R.id.edi6);
        editText7=findViewById(R.id.edi7);
        editText8=findViewById(R.id.edi8);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView4);

        database=FirebaseDatabase.getInstance();
        team=database.getReference("Team Name");

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(StudentRegistartion.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Register register = new Register(editText1.getText().toString(),editText2.getText().toString(),
                        editText3.getText().toString(),editText4.getText().toString(),
                        editText5.getText().toString(),editText6.getText().toString(),
                        editText7.getText().toString(),editText8.getText().toString());
                team.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child(register.getTeamName()).exists())
                            Toast.makeText(StudentRegistartion.this,"Team Name already Exits",Toast.LENGTH_SHORT).show();
                        else
                        {
                            team.child(register.getTeamName()).setValue(register);
                            Toast.makeText(StudentRegistartion.this,"Registration Succesfull",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });

    }
}
