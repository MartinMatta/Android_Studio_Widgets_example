package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        button = (Button) findViewById(R.id.button);

        checkBox1.setChecked(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check1 = checkBox1.isChecked();
                boolean check2 = checkBox2.isChecked();

                Toast.makeText(
                        getApplicationContext(),
                        "CheckBox1 = " + String.valueOf(check1) + "\n" + "CheckBox2 = " + String.valueOf(check2),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}