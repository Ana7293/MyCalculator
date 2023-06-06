package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button buttonAnswer = findViewById(R.id.buttonAnswer);
        TextView textAnswerCorrect = findViewById(R.id.textViewCorrect);
        TextView textAnswerIncorrect = findViewById(R.id.textViewIncorrect);

        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextAnswer.getText().toString();
                if (text.equals("15")) {
                    textAnswerCorrect.setVisibility(View.VISIBLE);
                    textAnswerIncorrect.setVisibility(View.GONE);
                } else {
                    textAnswerCorrect.setVisibility(View.GONE);
                    textAnswerIncorrect.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}