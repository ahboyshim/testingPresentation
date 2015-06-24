package com.example.shim.simpleworkout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        Intent intent;

        switch(item.getItemId()){

            case R.id.action_settings:
                intent = new Intent(this, settingActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_feedback:
                intent = new Intent(this, feedbackActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_help:
                intent = new Intent(this, helpActivity.class);
                startActivity(intent);
                return true;

        }

        return super.onOptionsItemSelected(item);

    }

    public void startWorkout(View view){

        Intent intent = new Intent(this, startActivity.class);

        startActivity(intent);

    }

    public void bmiCalc(View view){

        Intent intent = new Intent(this, bmiActivity.class);

        startActivity(intent);

    }

    public void info(View view){

        Intent intent = new Intent(this, infoActivity.class);

        startActivity(intent);

    }

    public void setting(View view){

        Intent intent = new Intent(this, settingActivity.class);

        startActivity(intent);

    }

}
