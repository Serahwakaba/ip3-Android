package com.moringaschool.covid19trackerweek3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText mName, mSurname, mEmail,mPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mName = findViewById(R.id.name);
        mSurname = findViewById(R.id.surname);
        mEmail = findViewById(R.id.email);
        mPassword = findViewById(R.id.password);
        button = findViewById(R.id.button);
    }
}