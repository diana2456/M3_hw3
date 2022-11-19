package space.lobanovi.m3_hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button next;
    Button nex;
    Button ne;
    Button ski;
    Button sk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ski = findViewById(R.id.ski);
        sk = findViewById(R.id.sk);

        next = findViewById(R.id.nex);
        nex = findViewById(R.id.next);
        ne = findViewById(R.id.ne);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment_2()).commit();
                next.setVisibility(android.view.View.GONE);
            }
        });
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_3()).commit();
            }
        });

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_1()).commit();
                ne.setVisibility(android.view.View.GONE);
            }
        });
        ski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_1()).commit();
            }
        });

        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_2()).commit();
                sk.setVisibility(android.view.View.GONE);
            }
        });
    }
}