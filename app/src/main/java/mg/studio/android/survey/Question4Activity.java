package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
    }

    public void btn_next(View v) {
        String q = new String("Q4: ");

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
        if (q.equals("Q4: ")) {
            Toast.makeText(this, "Haven't selected one", Toast.LENGTH_SHORT).show();
        }

        Intent intent = this.getIntent();
        intent.setClass(this, Question5Activity.class);
        Bundle bundle = intent.getExtras();
        bundle.putString("q4", q);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
