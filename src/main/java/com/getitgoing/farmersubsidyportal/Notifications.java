package com.getitgoing.farmersubsidyportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Notifications extends AppCompatActivity {

    ListView list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        list = (ListView) findViewById(R.id.list);
        String [] values = new String []{"1. Accepted", "2. Accepted", "3. Accepted", "4. Accepted", "5. Rejected", "6. Pending",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);
        list.setAdapter(adapter);

    }
}
