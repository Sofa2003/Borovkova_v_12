package com.example.borovkova_v_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button butn = (Button)findViewById(R.id.btn1);
        butn.setOnClickListener(this);

    }
    @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), PersonalArea.class);
            startActivity(intent);
        }
}