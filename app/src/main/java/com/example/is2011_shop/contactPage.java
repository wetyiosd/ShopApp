package com.example.is2011_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class contactPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);
    }

    public void telegram(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/itProger_official"));
        startActivity(browserIntent);
    }
    public void vk(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/prog_life"));
        startActivity(browserIntent);
    }
    public void youtube(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/PlurrimiTube"));
        startActivity(browserIntent);
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUsPage.class);
        startActivity(intent);
    }

    public void mainOpen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}