package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void btn_start(View v) {
        CheckBox chb = (CheckBox)findViewById(R.id.checkbox);
        if (chb.isChecked()) {
            startActivity(new Intent(this, Question1Activity.class));
        }
        else {
            Toast.makeText(this, "Haven't selected to accept", Toast.LENGTH_LONG).show();
            return;
        }
    }

}
