package com.hacktiv8.assignment2_count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView scoreTv;
    Button buttonCount;
    EditText namaEt;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTv = findViewById(R.id.score);
        buttonCount = findViewById(R.id.button_count);
        namaEt = findViewById(R.id.namaEt);

        buttonCount.setOnClickListener(this);

        if (savedInstanceState != null) {
            String count = savedInstanceState.getString("count");
            if (count != null) {
                scoreTv.setText(count);
                score = Integer.parseInt(count);
            }
        }
    }

    @Override
    public void onClick(View v) {
        try {
            String currentScore = scoreTv.getText().toString();
            int currentScoreInt = Integer.parseInt(currentScore);

            score = currentScoreInt + 1;
            scoreTv.setText(String.valueOf(score));
        } catch (NumberFormatException e) {
            // Handle the case where the text in scoreTv is not a valid integer.
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count", String.valueOf(score));
    }
}
