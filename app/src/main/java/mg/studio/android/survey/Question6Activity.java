package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Question6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
    }

    public void btn_next(View v) {
        String q = new String("Q6: ");

        if (((EditText)findViewById(R.id.editText)).getText().toString().equals("")) {
            Toast.makeText(this, "Can't be null", Toast.LENGTH_SHORT).show();
        }
        else {
            q += ((EditText)findViewById(R.id.editText)).getText().toString();
        }

        Intent intent = this.getIntent();
        intent.setClass(this, Question7Activity.class);
        Bundle bundle = intent.getExtras();
        bundle.putString("q6", q);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
