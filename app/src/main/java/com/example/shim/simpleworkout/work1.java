package com.example.shim.simpleworkout;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class work1 extends ActionBarActivity {

    TextView timer, count2;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);

        timer = (TextView)findViewById(R.id.timer);
        count2 = (TextView)findViewById(R.id.count2);
        startButton = (Button)findViewById(R.id.startButton);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_work1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startCountDown(View view){

        startButton.setEnabled(false);

        if(startButton.getText().toString().equals("Start")) {
            new CountDownTimer(7000, 1000) { // adjust the milli seconds here

                int count = 6;

                public void onTick(long millisUntilFinished) {


                    count--;
                    timer.setText("" + count);

                    if (count == 0) {
                        timer.setText("Go");
                        start2();
                    }

                }

                public void onFinish() {

                }

            }.start();
        }


        else if(startButton.getText().toString().equals("Next")){
            Intent intent = new Intent(this, lastActivity10.class);
            startActivity(intent);
        }

    }



    public void start2(){

        new CountDownTimer(32000, 1000) { // adjust the milli seconds here

            int count = 31;

            public void onTick(long millisUntilFinished) {

                count--;
                count2.setText("" + count);

                if(count==0){
                    count2.setText("Complete");
                    startButton.setText("Next");
                    startButton.setEnabled(true);
                }

            }

            public void onFinish() {

            }

        }.start();

    }

}
