package com.example.searchengine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autotextview;
    String search_engines[] = {"Yahoo", "Google", "MSN", "Bing", "Wiki","YouTube","Baidu","Yandex","DuckDuckGo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autotextview = findViewById(R.id.auto_complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  search_engines);
        autotextview.setThreshold(1);
        autotextview.setAdapter(adapter);
    }
}