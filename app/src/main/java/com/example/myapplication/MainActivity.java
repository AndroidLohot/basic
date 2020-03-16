package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listItem;
    private List<String> list=new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= Arrays.asList(getResources().getStringArray(R.array.story_title));
        listItem=(ListView)findViewById(R.id.listItem);
        adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,list);
        listItem.setAdapter(adapter);
    }
}
