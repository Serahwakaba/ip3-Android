package com.moringaschool.covid19trackerweek3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private EditText mName, mSurname, mEmail,mPassword;
    private Button button;


    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mName = findViewById(R.id.name);
        mSurname = findViewById(R.id.surname);
        mEmail = findViewById(R.id.email);
//        mPassword = findViewById(R.id.password);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  name = mName.getText().toString();
                root.child("o1").setValue(name);
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }

    public void goSave(View view) {
        Intent intent=new Intent(Login.this,MainActivity.class);
        startActivity(intent);
//        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }
}