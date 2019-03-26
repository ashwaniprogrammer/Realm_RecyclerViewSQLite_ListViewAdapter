package com.example.realm_recyclerviewsqlite_listviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView=findViewById(R.id.listView);
        ArrayAdapter<String> listAdapter=new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1
        ,arrayList);
        listView.setAdapter(listAdapter);
    }
}
