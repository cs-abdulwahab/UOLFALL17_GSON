package com.example.abdul_wahab.uolfall17_gson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.abdul_wahab.uolfall17_gson.models.Contact;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contact c = new Contact(1, "abc", true);


        Gson gson = new Gson();

        gson.toJson(c);







    }
}
