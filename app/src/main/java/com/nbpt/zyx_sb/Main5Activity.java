package com.nbpt.zyx_sb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main5Activity extends Activity {
    String name[] = {"智慧家居","智能商超","天气预报","设置中心"};
    GridView gridView;
    int image[]= {R.drawable.icon_home, R.drawable.icon_shopping,
            R.drawable.icon_weather, R.drawable.icon_settings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        GridView gridView = (GridView)findViewById(R.id.zhcs);

        String[] from = {"img","name"};
        int[] to ={R.id.imageView2,R.id.textView2};
        List<Map<String,Object>> imageList= new ArrayList<Map<String,Object>>();
        for(int i=0;i<image.length;i++){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("img",image[i]);
            map.put("name",name[i]);
            imageList.add(map);
        }
        SimpleAdapter adapter= new SimpleAdapter(Main5Activity.this,imageList,R.layout.color,from,to);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(Main5Activity.this,"当前点击的是："+name[i],Toast.LENGTH_SHORT).show();
                switch (i){
                    case 0:{Intent intent = new Intent(Main5Activity.this,zhienngjiaju.class);
                             startActivity(intent);
                            break;}
                    case 1:{Intent intent2 = new Intent(Main5Activity.this,zhinengshangchao.class);
                             startActivity(intent2);
                            break;}
                    case 2:{Intent intent2 = new Intent(Main5Activity.this,tianqiyubao.class);
                        startActivity(intent2);
                        break;}
                    case 3:{Intent intent2 = new Intent(Main5Activity.this,shezhi.class);
                        startActivity(intent2);
                        break;}
                }
            }
        });
    }
}
