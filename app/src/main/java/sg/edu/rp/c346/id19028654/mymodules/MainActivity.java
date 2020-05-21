package sg.edu.rp.c346.id19028654.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1,tvMod2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod2=findViewById(R.id.textViewModule2);
        tvMod1=findViewById(R.id.TextViewModule1);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Module.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android programming");
                intent.putExtra("AcademicYear" ,2020);
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66m");
                startActivity(intent);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Module.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("ModuleName","ipad programming");
                intent.putExtra("AcademicYear" ,2020);
                intent.putExtra("Semester",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","E63b");
                startActivity(intent);
            }

        });
    }
}
