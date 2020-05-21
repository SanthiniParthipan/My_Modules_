package sg.edu.rp.c346.id19028654.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Module extends AppCompatActivity {

    Button back;
    TextView tvMc,tvMn,tvAy,tvS,tvMcr,tvV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvMc=findViewById(R.id.textViewModuleCode);
        tvMn=findViewById(R.id.textViewMoculeName);
        tvAy=findViewById(R.id.textViewAcademicYear);
        tvS=findViewById(R.id.textViewSemester);
        tvMcr=findViewById(R.id.textViewModuleCredit);
        tvV=findViewById(R.id.textViewVenue);
        back=findViewById(R.id.buttonBack);

        Intent intendReceived =getIntent();
        String ModuleCode= intendReceived.getStringExtra("ModuleCode");
        String ModuleName= intendReceived.getStringExtra("ModuleName");
        String Venue= intendReceived.getStringExtra("Venue");
        int AcademicYear =  intendReceived.getIntExtra("AcademicYear",0);
        int Semester =  intendReceived.getIntExtra("Semester",0);
        int ModuleCredit =  intendReceived.getIntExtra("ModuleCredit",0);

        tvMc.setText("Module code :" +ModuleCode);
        tvMn.setText("Module Name:" +ModuleName);
        tvAy.setText("Academic year:" +AcademicYear);
        tvS.setText("Semester:" +Semester);
        tvMcr.setText("Module credit :" +ModuleCredit);
        tvV.setText("Venue :" +Venue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
