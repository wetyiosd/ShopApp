package com.example.is2011_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_page);
    }

    public void contactOpen(View view) {
        Intent intent = new Intent(this, contactPage.class);
        startActivity(intent);
    }

    public void mainOpen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}