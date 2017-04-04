package com.example.vatsal.ororide;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class HomeActivity extends ActionBarActivity{

    ImageView imgahm, imgraj, imgsur, imgvad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        imgahm = (ImageView) findViewById(R.id.imgahm);
        imgahm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent i = new Intent(HomeActivity.this,Main2Activity.class);
                    startActivity(i);
                }
            }
        });

        imgraj = (ImageView) findViewById(R.id.imgraj);
        imgraj.setClickable(true);

        imgsur = (ImageView) findViewById(R.id.imgsur);
        imgahm.setClickable(true);

        imgvad = (ImageView) findViewById(R.id.imgvad);
        imgraj.setClickable(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


   /* public void onClick(View v) {
            if(v == imgahm)
            {

            }
            else if(v == imgraj)
            {

            }
            else if(v == imgsur)
            {

            }
            else if(v == imgvad)
            {

            }
      //this is home activity
    }*/
}
