package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}
