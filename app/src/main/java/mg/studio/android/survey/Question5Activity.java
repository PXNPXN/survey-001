package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Question5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
    }

    public void btn_next(View v) {
        String q = new String("Q5: ");

        if (((CheckBox)findViewById(R.id.checkbox2)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox2)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox3)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox3)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox4)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox4)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox5)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox5)).getText().toString() + ' ';
        }
        if (((CheckBox)findViewById(R.id.checkbox6)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox6)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox7)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox7)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox8)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox8)).getText().toString() + " ";
        }
        if (((CheckBox)findViewById(R.id.checkbox9)).isChecked()) {
            q += ((CheckBox)findViewById(R.id.checkbox9)).getText().toString() + " ";
        }
        if (q.equals("Q5: ")) {
            Toast.makeText(this, "Haven't selected one", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = this.getIntent();
        intent.setClass(this, Question6Activity.class);
        Bundle bundle = intent.getExtras();
        bundle.putString("q5", q);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
