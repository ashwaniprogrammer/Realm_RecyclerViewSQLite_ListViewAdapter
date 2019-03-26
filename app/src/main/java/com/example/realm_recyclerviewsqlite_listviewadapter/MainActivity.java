package com.example.realm_recyclerviewsqlite_listviewadapter;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    Button save,view;
    EditText name,email,blog;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save=findViewById(R.id.save);
        view=findViewById(R.id.view);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        blog=findViewById(R.id.blog);

        sqLiteDatabase=openOrCreateDatabase("sqlite_ListView",0,null);
        sqLiteDatabase.execSQL("create table if not exists Sqlitedb(name varchar(200)," +
                "email varchar(350),blog varchar(500))");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase.execSQL("insert into Sqlitedb values('"+name.getText().toString()+"','"+email.getText().toString()+"'" +
                        ",'"+blog.getText().toString()+"')");
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Data entered successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });
        save.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
    }
}
