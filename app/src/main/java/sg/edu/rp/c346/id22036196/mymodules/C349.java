package sg.edu.rp.c346.id22036196.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C349 extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c349);

        //connect
        tvCode=findViewById(R.id.textViewCode2);
        tvName=findViewById(R.id.textViewName2);
        tvYear=findViewById(R.id.textViewYear2);
        tvSem=findViewById(R.id.textViewSem2);
        tvCredit=findViewById(R.id.textViewCredit2);
        tvVenue=findViewById(R.id.textViewVenue2);

        Intent intentReceived=getIntent();
        String code=intentReceived.getStringExtra("code");
        tvCode.setText("Module Code: "+code);
        String name=intentReceived.getStringExtra("name");
        tvName.setText("Module Name: "+name);
        int year=intentReceived.getIntExtra("year",0);
        tvYear.setText("Academic Year: "+year);
        int sem=intentReceived.getIntExtra("semester",0);
        tvSem.setText("Semester: "+sem);
        int credit=intentReceived.getIntExtra("credit",0);
        tvCredit.setText("Module Credit: "+credit);
        String venue=intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue: "+venue);
    }
}