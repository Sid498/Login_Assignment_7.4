package com.example.sid.login_assignment_74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Username extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        Bundle extras = getIntent().getExtras();

        TextView text = (TextView) findViewById(R.id.tvusername);
        String username = getIntent().getStringExtra("USERNAME");
        text.setText("Welcome "+username.toString());
    }
}
