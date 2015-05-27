package com.app.kiory.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.context = (Context) this;

        Button button_the_cat = (Button) findViewById(R.id.button_the_cat);
        Button button_the_thing1 = (Button) findViewById(R.id.button_the_thing1);
        Button button_the_thing2 = (Button) findViewById(R.id.button_the_thing2);
        Button button_thingamajigger = (Button) findViewById(R.id.button_thingamajigger);
        Button button_sally = (Button) findViewById(R.id.button_sally);
        Button button_nick = (Button) findViewById(R.id.button_nick);
        Button button_dr_seuss = (Button) findViewById(R.id.button_dr_seuss);


        button_the_cat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_the_cat), Toast.LENGTH_SHORT).show();
            }
        });

        button_the_thing1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_the_thing1), Toast.LENGTH_SHORT).show();
            }
        });

        button_the_thing2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_the_thing2), Toast.LENGTH_SHORT).show();
            }
        });

        button_thingamajigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_thingamajigger), Toast.LENGTH_SHORT).show();
            }
        });

        button_sally.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_sally), Toast.LENGTH_SHORT).show();
            }
        });

        button_nick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_nick), Toast.LENGTH_SHORT).show();
            }
        });

        button_dr_seuss.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, getString(R.string.button_dr_seuss), Toast.LENGTH_SHORT).show();
            }
        });
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
}
