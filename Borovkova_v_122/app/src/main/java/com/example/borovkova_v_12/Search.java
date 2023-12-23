package com.example.borovkova_v_12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity implements View.OnClickListener{
    private View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        ImageView imageView=(ImageView) findViewById(R.id.imageView8);
        imageView.setOnClickListener(this);
        ImageView imageView1=(ImageView) findViewById(R.id.imageView9);
        imageView1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView8) {
            Intent intent = new Intent(this, PersonalArea.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageView9) {
            Intent intent1 = new Intent(this, Login.class);
            startActivity(intent1);
        }
    }
}
