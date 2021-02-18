package com.example.edittextexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private EditText inputNumber;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText)findViewById(R.id.input_text);
        inputNumber = (EditText)findViewById(R.id.input_number);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    String text = inputText.getText().toString();
                    float number = Float.parseFloat(inputNumber.getText().toString()); // if android:inputType="numberDecimal"
                    //int number = Integer.parseInt(inputNumber.getText().toString());    if android:inputType="number"

                    Toast.makeText(
                            getApplicationContext(),
                            "text = " + text + "\n" + "number = " + String.valueOf(number),
                            Toast.LENGTH_LONG
                    ).show();

                } catch (Exception a) {
                    Toast.makeText(
                            getApplicationContext(), "EditText is empty", Toast.LENGTH_SHORT
                    ).show();
                }

            }
        });

    }
}