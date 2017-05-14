package com.example.sid.login_assignment_74;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();

    }

    public void Login(View v) {

        EditText username = (EditText) findViewById(R.id.etUsername);
        EditText password = (EditText) findViewById(R.id.etPassword);

        if (username.getText().toString().equals("acadgild") && password.getText().toString().equals("admin")) {
            Intent in =new Intent(getBaseContext(),Username.class);
            in.putExtra("USERNAME",username.getText().toString());
            startActivity(in);
            Toast.makeText(this, "Login"+username.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }


    }
}
