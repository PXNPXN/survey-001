package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
    }

    public void btn_next(View v) {
        String q = new String("Q1: ");

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
        else if (((RadioButton)findViewById(R.id.radioButton6)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton6)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton7)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton7)).getText().toString();
        }
        else if (((RadioButton)findViewById(R.id.radioButton8)).isChecked()) {
            q += ((RadioButton)findViewById(R.id.radioButton8)).getText().toString();
        }
        else  {
            Toast.makeText(this, "Haven't selected one", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, Question2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("q1", q);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
