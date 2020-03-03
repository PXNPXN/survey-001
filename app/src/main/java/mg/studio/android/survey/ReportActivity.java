package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_survey);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        ((TextView)findViewById(R.id.textQ1)).setText(bundle.getString("q1"));
        ((TextView)findViewById(R.id.textQ2)).setText(bundle.getString("q2"));
        ((TextView)findViewById(R.id.textQ3)).setText(bundle.getString("q3"));
        ((TextView)findViewById(R.id.textQ4)).setText(bundle.getString("q4"));
        ((TextView)findViewById(R.id.textQ5)).setText(bundle.getString("q5"));
        ((TextView)findViewById(R.id.textQ6)).setText(bundle.getString("q6"));
        ((TextView)findViewById(R.id.textQ7)).setText(bundle.getString("q7"));
        ((TextView)findViewById(R.id.textQ8)).setText(bundle.getString("q8"));
        ((TextView)findViewById(R.id.textQ9)).setText(bundle.getString("q9"));
        ((TextView)findViewById(R.id.textQ10)).setText(bundle.getString("q10"));
        ((TextView)findViewById(R.id.textQ11)).setText(bundle.getString("q11"));
        ((TextView)findViewById(R.id.textQ12)).setText(bundle.getString("q12"));

        String msg = new String();
        msg = "{ \"Q1\":\"" + bundle.getString("q1") + "\", ";
        msg += "\"Q2\":\"" + bundle.getString("q2") + "\", ";
        msg += "\"Q3\":\"" + bundle.getString("q3") + "\", ";
        msg += "\"Q4\":\"" + bundle.getString("q4") + "\", ";
        msg += "\"Q5\":\"" + bundle.getString("q5") + "\", ";
        msg += "\"Q6\":\"" + bundle.getString("q6") + "\", ";
        msg += "\"Q7\":\"" + bundle.getString("q7") + "\", ";
        msg += "\"Q8\":\"" + bundle.getString("q8") + "\", ";
        msg += "\"Q9\":\"" + bundle.getString("q9") + "\", ";
        msg += "\"Q10\":\"" + bundle.getString("q10") + "\", ";
        msg += "\"Q11\":\"" + bundle.getString("q11") + "\", ";
        msg += "\"Q12\":\"" + bundle.getString("q12") + "\", ";

        saveToFile(msg);
    }

    public void saveToFile(String msg) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_UNMOUNTED)) {
            Toast.makeText(this, "No external storage", Toast.LENGTH_SHORT).show();
        }
        else {
            File sdFile = Environment.getExternalStorageDirectory();
            System.out.println("---------------------"+sdFile);
            File saveData = new File(sdFile, "savedata.txt");

            try {
                FileOutputStream fout = new FileOutputStream(saveData);
                fout.write(msg.getBytes());
                fout.flush();
                fout.close();

                Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
