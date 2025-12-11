package com.example.adapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         listView = findViewById(R.id.mylistview);

         String[] countries = {"Pakistan", "USA", "CHINA"};

//        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                countries
//        );
        myCustomAdapter myAdapter = new myCustomAdapter(this, countries);

        listView.setAdapter(myAdapter);
    }
}