package com.getitgoing.farmersubsidyportal;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SignUpPage extends AppCompatActivity implements View.OnClickListener {

    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        EditText name = (EditText) findViewById(R.id.name);
        EditText age = (EditText) findViewById(R.id.age);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        Button signpubutton = (Button) findViewById(R.id.button);
        Button aadhar = (Button) findViewById(R.id.aadhar);
        /*
        SharedPreferences sharedPreferences = getSharedPreferences("Mydata",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        editor.putString("name",name.getText().toString());
        editor.putString("age",age.getText().toString());
        editor.putString("username",username.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.apply();

        */







        signpubutton.setOnClickListener(this);
        aadhar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button) {
                Intent in = new Intent(this,LoginActivity.class);
                in.putExtra("message",username.getText().toString()+" "+password.getText().toString());
                startActivity(in);
            } else if (v.getId()==R.id.aadhar){
            int requestCode=100;
            Log.e("hjds","cds");
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_DENIED)
            {

                ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, requestCode);
            }
            startActivity(intent);
        }
        }

    }




