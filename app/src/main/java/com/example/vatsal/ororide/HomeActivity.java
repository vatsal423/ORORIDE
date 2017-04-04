package com.example.vatsal.ororide;

import android.app.ActionBar;
import android.app.Activity;
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

public class HomeActivity extends ActionBarActivity {

    String[] ahm = new String[]{"select...","CTM","Vastrapur","Gita Mandir","Paldi"};
    String[] raj = new String[]{};
    String[] sur = new String[]{};
    String[] vad = new String[]{};



    ImageView imgahm, imgraj, imgsur, imgvad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        final Spinner sp1 = (Spinner)findViewById(R.id.spin1);
        final Spinner sp2 = (Spinner)findViewById(R.id.spin2);



        imgahm = (ImageView) findViewById(R.id.imgahm);
        imgahm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                       ArrayAdapter adp1 = new ArrayAdapter<String>(HomeActivity.this,android.R.layout.select_dialog_multichoice,ahm);
                        sp1.setAdapter(adp1);
                        sp2.setAdapter(adp1);

                }

            }
        });



        imgraj = (ImageView) findViewById(R.id.imgraj);
        imgraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                }
            }
        });





        imgsur = (ImageView) findViewById(R.id.imgsur);
        imgsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                }
            }
        });





        imgvad = (ImageView) findViewById(R.id.imgvad);
        imgvad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                }
            }
        });


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
