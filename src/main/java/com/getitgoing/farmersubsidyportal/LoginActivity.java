package com.getitgoing.farmersubsidyportal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    EditText password;
    Button login;
    Button signup;
    HashMap<String,String> map =new HashMap<String,String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        map.put("onkar","onkar");
        map.put("shirish","shirish");
        map.put("prakruti","prakruti");
        map.put("keya","keya");
        map.put("ashray","ashray");

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        if (message.equals("Main")){}
        else{
            String [] words = message.split(" ");
            map.put(words[0],words[1]);
        }

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.SignUp);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        final Context context = this;
       if (v.getId()==R.id.login) {

           String input1 = username.getText().toString();
           String input2 = password.getText().toString();

           if (map.size()==0)
           {
               username.setText("");
               password.setText("");
           }

           for (Map.Entry<String,String> entry : map.entrySet())
           {
               Log.e("key",entry.getKey());
               Log.e("pass",entry.getValue());
           }
           if (map.containsKey(input1) ){
               if (map.get(input1).equals(input2))
               {
                   Intent in = new Intent(this,MainPage.class);
                   startActivity(in);
               }
               else
               {
                   username.setText("");
                   password.setText("");
               }
           }
           else
           {
               username.setText("");
               password.setText("");
           }


           Log.e("size",String.valueOf(map.size()));

       }
        else if (v.getId()==R.id.SignUp){
           Intent intent = new Intent (context,SignUpPage.class);

           startActivity(intent);
       }

        }

    }

