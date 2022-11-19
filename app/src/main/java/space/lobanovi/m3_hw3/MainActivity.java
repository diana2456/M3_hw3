package space.lobanovi.m3_hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
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

                if(savedInstanceState ==  null){
                    getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_1()).commit();
                }


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_2()).addToBackStack(null).commit();
                next.setVisibility(android.view.View.GONE);
            }
        });
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.container,new Fragment_3()).addToBackStack(null).commit();
            }
        });

       ski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment_1()).commit();
            }
        });
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment_2()).commit();
                    sk.setVisibility(android.view.View.GONE);
            }
        });
    }

}