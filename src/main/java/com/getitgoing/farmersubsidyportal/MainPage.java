package com.getitgoing.farmersubsidyportal;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainPage extends AppCompatActivity implements View.OnClickListener{

    Button documents,subsidy,notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

         documents = (Button) findViewById(R.id.documents);
        subsidy = (Button) findViewById(R.id.subsidy);
         notification = (Button) findViewById(R.id.notifications);

        documents.setOnClickListener(this);
        subsidy.setOnClickListener(this);
        notification.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.documents){

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
        else if (v.getId()==R.id.subsidy){
            Intent intent = new Intent(this,Webview.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.notifications){

            Intent inte = new Intent(this,Notifications.class);
            startActivity(inte);

        }

    }
}
