package com.nbpt.zyx_sb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent= getIntent();
        if (intent != null){
            String username = intent.getStringExtra("username");
            String gebder = intent.getStringExtra("gender");
            String phonenumber = intent.getStringExtra("phonenumber");
        }
    }
}
