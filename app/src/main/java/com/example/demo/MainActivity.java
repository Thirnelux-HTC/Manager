package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCalc= (Button) findViewById(R.id.btnCalc);
        Button btnCont= (Button) findViewById(R.id.btnContacts);
        btnCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageCont= new Intent(MainActivity.this,contacts.class);
                startActivity(pageCont);
            }
        });

        btnCalc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageCalc= new Intent( MainActivity.this,calculatrice.class);
                startActivity(pageCalc);
            }
        }));
    }

}
