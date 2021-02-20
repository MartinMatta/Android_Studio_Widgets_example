package com.example.switchexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private Switch switch1;
    private Switch switch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String switch_text1;
                String switch_text2;

                if (switch1.isChecked()) {
                    switch_text1 = switch1.getTextOn().toString();
                } else {
                    switch_text1 = switch1.getTextOff().toString();
                }

                if (switch2.isChecked()) {
                    switch_text2 = switch2.getTextOn().toString();
                } else {
                    switch_text2 = switch2.getTextOff().toString();
                }

                Toast.makeText(
                        getBaseContext(),
                        "switch 1 = " + switch_text1 + "\n" + "switch 2 = " + switch_text2,
                        Toast.LENGTH_LONG
                ).show();

            }
        });
    }
}