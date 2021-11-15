package com.example.smartstegno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.smartstegno.R;

import java.util.logging.LogRecord;

public class IntroActivity extends AppCompatActivity {
    Button next;
    TextView appname,subpart,subpart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        appname=(TextView)findViewById(R.id.appname);
        subpart=(TextView)findViewById(R.id.subpart);
        subpart2=(TextView)findViewById(R.id.subpart2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 5000);

        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}