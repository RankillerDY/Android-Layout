package com.example.prm_day1_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Instagram extends AppCompatActivity {
    private TextView txtUsername, txtPassword;
    private Button signInButton;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        //Get the attribute by there id
        txtUsername = findViewById(R.id.txtName);
        txtPassword = findViewById(R.id.txtPassword);
        signInButton = findViewById(R.id.SignInbutton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
            }
        });

    }

    public void onLogin() {
        Toast.makeText(Instagram.this, "Đăng nhập thành công!!", Toast.LENGTH_SHORT).show();
    }
}
