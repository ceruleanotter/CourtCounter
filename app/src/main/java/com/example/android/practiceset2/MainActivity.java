package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int score1 = 0;
    int score2 = 0;
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void score1One(View v){
        score1+= 1;
        displayScore1(score1);
    }

    public void score1Two(View v){
        score1+= 2;
        displayScore1(score1);
    }

    public void score1Three(View v){
        score1+= 3;
        displayScore1(score1);
    }

    public void score2One(View v){
        score2+= 1;
        displayScore2(score2);
    }

    public void score2Two(View v){
        score2+= 2;
        displayScore2(score2);
    }

    public void score2Three(View v){
        score2+= 3;
        displayScore2(score2);
    }

    public void reset(View v){
        score2 = 0;
        score1 = 0;
        displayScore2(score2);
        displayScore1(score1);
    }

    public void displayScore1(int score) {
        TextView scoreView = (TextView)findViewById(R.id.score_1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScore2(int score) {
        TextView scoreView = (TextView)findViewById(R.id.score_2);
        scoreView.setText(String.valueOf(score));
    }


}
