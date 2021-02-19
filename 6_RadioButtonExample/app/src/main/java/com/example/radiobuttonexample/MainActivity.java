package com.example.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioGender;
    private RadioGroup radioGroup;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();

                radioGender = (RadioButton) findViewById(id);

                if (id != -1) {
                    Toast.makeText(
                            getApplicationContext(),
                            radioGender.getText(),
                            Toast.LENGTH_SHORT
                    ).show();

                } else {
                    Toast.makeText(
                            getApplicationContext(),
                            "Nothing selected",
                            Toast.LENGTH_SHORT
                    ).show();

                }
            }
        });
    }
}