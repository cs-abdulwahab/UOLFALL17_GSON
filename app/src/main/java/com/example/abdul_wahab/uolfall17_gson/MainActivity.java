package com.example.abdul_wahab.uolfall17_gson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.abdul_wahab.uolfall17_gson.models.Contact;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        /*Contact c = new Contact(1, "abc", true);


        String str = gson.toJson(c);
        Log.d(TAG, "Contact JSON is  " + str);
        */

        String str = "{\"gender\":true,\"id\":1,\"name\":\"abc\"}";

        Contact c = gson.fromJson(str, Contact.class);

        String s = "";


// Intent intent ;


    }
}
