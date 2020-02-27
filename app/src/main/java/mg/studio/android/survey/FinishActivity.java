package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
    }

    public void btn_finish(View v) {
        Intent intent = this.getIntent();
        intent.setClass(this, ReportActivity.class);
        Bundle bundle = intent.getExtras();
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
