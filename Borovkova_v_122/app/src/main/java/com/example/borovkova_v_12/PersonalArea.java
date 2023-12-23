package com.example.borovkova_v_12;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        ImageView imageView = (ImageView) findViewById(R.id.imageView5);
        imageView.setOnClickListener(this);
        ImageView imageView1View =(ImageView) findViewById(R.id.imageView);
        imageView1View.setOnClickListener(this);
    }
    public void onClickAdress(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:")));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView5) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imageView) {
            Intent intent1 = new Intent(this, Search.class);
            startActivity(intent1);
        }
    }
}
