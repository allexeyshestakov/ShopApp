package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Order;

import java.util.ArrayList;
import java.util.List;

public class orderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView ordersList = findViewById(R.id.ordersList);

        List<String> coursesTitle = new ArrayList<>();
        for(Course c : MainActivity.fullCoursesList) {
            if(Order.itemsId.contains(c.getId())) {
                coursesTitle.add(c.getCourseTitle());
            }
        }
        ordersList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesTitle));
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, activityAboutUs.class);
        startActivity(intent);
    }
    public void openContacts(View view) {
        Intent intent = new Intent(this, contacts.class);
        startActivity(intent);
    }
    public void openMainPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

