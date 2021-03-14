package com.example.android.practicejavaforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView message = new TextView(this);
//        message.setText("hello there");
//        message.setAllCaps(true);
//        message.setTextSize(80);
//        message.setTextColor(Color.RED);
        setContentView(R.layout.activity_main);

    }
    boolean hungry = true;
    public void eat(View v)
    {
        if(hungry)
        {
            TextView message = (TextView)findViewById(R.id.message);
            String str="I am so full";
            message.setText(str);
            ImageView cookie = (ImageView)findViewById(R.id.cookie_before);
            cookie.setImageResource(R.drawable.after_cookie);
            Button b = (Button)findViewById(R.id.b);
            String st = "Do exercise !";
            b.setText(st);
            hungry=false;
        }
        else
        {
            TextView message = (TextView)findViewById(R.id.message);
            String str="I'm so hungry";
            message.setText(str);
            ImageView cookie = (ImageView)findViewById(R.id.cookie_before);
            cookie.setImageResource(R.drawable.before_cookie);
            hungry=true;
            Button b = (Button)findViewById(R.id.b);
            String st = "Eat cookie";
            b.setText(st);
        }
    }
}