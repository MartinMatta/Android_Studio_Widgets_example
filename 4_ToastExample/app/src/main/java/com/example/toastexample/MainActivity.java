package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast2;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(), "This is a toast!", Toast.LENGTH_SHORT
                ).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast,
                        (ViewGroup)findViewById(R.id.toast_layout_root));

                ImageView image = (ImageView) layout.findViewById(R.id.image);
                image.setImageResource(R.drawable.image);
                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText(R.string.toast_text);


                toast2 = new Toast(getApplicationContext());
                toast2.setGravity(Gravity.TOP, 0, 220);
                toast2.setDuration(Toast.LENGTH_LONG);
                toast2.setView(layout);
                toast2.show();
            }
        });
    }
}