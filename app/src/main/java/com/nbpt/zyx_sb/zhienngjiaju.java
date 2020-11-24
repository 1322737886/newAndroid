package com.nbpt.zyx_sb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class zhienngjiaju extends Activity {
        ListView listview;
        String name[] = {"智能家居","智能家居","智能家居","智能家居"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhienngjiaju);

        ListView listView = findViewById(R.id.zz);
        ArrayAdapter<String>adapter =new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,name);
        listView.setAdapter(adapter);


    }
}
