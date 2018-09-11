package com.example.hp.gas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**

 import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.hp.gas.R;

/**
 * Created by For on 4/14/2017. 
 */

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agent);

    }
    public void Ganesh(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("قائمة الطلبات "))
        {
            Intent ganesh = new Intent(this,orderlist.class);
            startActivity(ganesh);
        }
        else if (button_text.equals("الطلب"))
        {
            Intent mass = new Intent(this,qr.class);
            startActivity(mass);

        }
    }
}