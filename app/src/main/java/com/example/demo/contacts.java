package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;
import models.User;
public class contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        List<User> UserList = new ArrayList<>();
        ListView listView = (ListView) findViewById(R.id.listUser) ;
        UserList.add(new User("HOUNKPEVI", "Thirnelux", 18,"Masculin","+22967872839"));
        UserList.add(new User("GATES", "Melinda", 36,"Féminin","+4468796345"));
        UserList.add(new User("DIESEL", "Vin", 40,"Masculin","+1325789654"));
        UserList.add(new User("OBAMA", "Michele", 52,"Féminin","+23478912006"));
        UserList.add(new User("CAGE", "Luc", 40,"Féminin","+3268933306"));

        listView.setAdapter(new Adapter(this,UserList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User item = (User) parent.getItemAtPosition(position);
                Intent intent = new Intent(contacts.this, Contacts_details.class);
                intent.putExtra("user_first_name", item.getFirst_name());
                intent.putExtra("user_last_name", item.getLast_name());
                intent.putExtra("user_phone", item.getPhone());
                intent.putExtra("user_sexe", item.getSexe());

                startActivity(intent);
            }
        });
    }
}
