package com.example.nilay.nearby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView autho_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String authorization_info= getIntent().getStringExtra("Authorization_info");
        authorization_info = authorization_info.replace("$", System.getProperty("line.separator"));

        autho_info = findViewById(R.id.autho_info);
        autho_info.setText(authorization_info);

    }
}
