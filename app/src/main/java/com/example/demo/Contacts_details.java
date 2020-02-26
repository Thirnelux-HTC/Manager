package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Contacts_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_details);
        Bundle bundle = getIntent().getExtras();
        this.setTitle("Détails de l'utilisateur");
        if (bundle != null) {
            TextView fn = (TextView) findViewById(R.id.txt_user_fn);
            TextView ln = (TextView) findViewById(R.id.user_ln);
            TextView tel = (TextView) findViewById(R.id.user_phone);
            TextView ugender = (TextView) findViewById(R.id.user_gender);

            String first_name =  bundle.getString("user_first_name");
            String last_name =  bundle.getString("user_last_name");
            String gender =  bundle.getString("user_sexe");
            String phone =  bundle.getString("user_phone");

            fn.setText(first_name);
            ln.setText(last_name);
            tel.setText(phone);
            ugender.setText(gender);

        }
    }
    public  void Call(View view) {
        int id = view.getId();
        if (id == R.id.Call) {
            TextView tel = (TextView) findViewById(R.id.user_phone);
            Intent i = new Intent(Intent.ACTION_DIAL);
            String p = "tel:" + tel.getText().toString();
            i.setData(Uri.parse(p));
            startActivity(i);

        }
    }
}
