package com.kaivanshah.assignment34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt_WelcomeMsg = (TextView)(this.findViewById(R.id.txt_WelcomeMsg));
        Intent intent = getIntent();
        String Username = intent.getStringExtra("username");
        txt_WelcomeMsg.setText("Welcome" + " " + Username);

    }
}
