package com.example.alcides.exemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String vetordados[] = {
                "Fulano 1 / fulano1@gmail.com",
                "Fulano 2 / fulano2@gmail.com",
                "Fulano 3 / fulano3@gmail.com",
                "Ana Lopes / alopes@outlook.com",
                "Luiz Souza / luizsouza@gmail.com",
                "Jorge Lima / jlimas@hotmail.com",
                "Renata Silva / resilva89a@gmail.com",
                "Pedro G. / pguzmaolin@gmail.com"
        };

        final ArrayAdapter<String> myadapter = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.item_list,
                R.id.id_text_view,
                vetordados);

        ListView lista = (ListView) findViewById(R.id.list_view);
        lista.setAdapter(myadapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Item= " + myadapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
