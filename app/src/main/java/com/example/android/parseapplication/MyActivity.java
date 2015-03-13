package com.example.android.parseapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;

import java.util.Date;

import dataaccess.FoodItem;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");

        FoodItem fi_init = new FoodItem();
        fi_init.setAddedDate(new Date());
        fi_init.setName("bharat");
        fi_init.setType("crazy");
        try {
            fi_init.save();
            testObject.save();
            Log.d("sss","saveings");
            Log.d("Bharath ",""+testObject.isDataAvailable());
        } catch (ParseException e) {
            Log.d("sss",e.getLocalizedMessage());
            e.printStackTrace();
        }

        setContentView(R.layout.activity_my);


     //   Parse.initialize(this, "XkS843rZYvQp2YQKDPg0WmhG6Tm4WAuBwv6EQpiz", "MaTeXi4fAvFS2ZmhA0gzNN4W7tN172GMXeDxyaWC");
        testObject.put("foo1", "bar");
        try {
            testObject.save();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
