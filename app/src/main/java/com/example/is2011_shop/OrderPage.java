package com.example.is2011_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.is2011_shop.model.Course;
import com.example.is2011_shop.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView orders_list = findViewById(R.id.orderList);

        List<String> coursesTitle = new ArrayList<>();
        for (Course c : MainActivity.fullCourseList) {
            if (Order.items_id.contains(c.getId())) {
                coursesTitle.add(c.getTitle());

            }
        }

        orders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesTitle));
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUsPage.class);
        startActivity(intent);
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