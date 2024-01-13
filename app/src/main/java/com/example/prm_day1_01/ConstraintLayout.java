package com.example.prm_day1_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrainstlayout);

        Button signInButton = findViewById(R.id.buttonConstraintLayout);
        View.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConstraintLayout.this,"hello",Toast.LENGTH_LONG).show();
            }
        };
        signInButton.setOnClickListener(btnListener);
    }
}
