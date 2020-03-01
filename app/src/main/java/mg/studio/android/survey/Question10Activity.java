package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Question10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);
    }

    public void btn_next(View v) {
        String q = new String("Q10: ");

        if (((RadioButton)findViewById(R.id.radioButton2)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton2)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton3)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton3)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton4)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton4)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton5)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton5)).getText().toString();
        }
        else  {
            Toast.makeText(this, "Haven't selected one", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = this.getIntent();
        intent.setClass(this, Question11Activity.class);
        Bundle bundle = intent.getExtras();
        bundle.putString("q10", q);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
