package com.getitgoing.farmersubsidyportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstActivity extends AppCompatActivity implements View.OnClickListener{

    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.login){
            Intent intent = new Intent(this,LoginActivity.class);
            intent.putExtra("message","Main");
            startActivity(intent);
        }
        else if (v.getId()==R.id.signup){
            Intent intent = new Intent (this,SignUpPage.class);
            startActivity(intent);
        }
    }
}
