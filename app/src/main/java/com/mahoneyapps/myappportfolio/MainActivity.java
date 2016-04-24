package com.mahoneyapps.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mTitle = "My App Portfolio";
    Context mContext = this;
    private String toastPopMovies = "This is my Popular Movies app!";
    private String toastStockHawk = "This is my Stock Hawk app!";
    private String toastBuildBigger = "This is my Build it Bigger app!";
    private String toastMaterialApp = "This is my Material Design app!";
    private String toastUbiquitous = "This is my Go Ubiquitous app!";
    private String toastCapstone = "This is my Capstone app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set title of Action Bar to App Title
        setTitle(mTitle);

        // instantiate Buttons and set click listeners
        // pop up Toasts when buttons are clicked
        Button popularMovies = (Button) findViewById(R.id.popular_movies);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastPopMovies, Toast.LENGTH_SHORT).show();
            }
        });

        Button stockHawk = (Button) findViewById(R.id.stock_hawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastStockHawk, Toast.LENGTH_SHORT).show();
            }
        });

        Button buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastBuildBigger, Toast.LENGTH_SHORT).show();
            }
        });

        Button materialApp = (Button) findViewById(R.id.app_material);
        materialApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastMaterialApp, Toast.LENGTH_SHORT).show();
            }
        });

        Button goUbiquitous = (Button) findViewById(R.id.ubiquitous);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastUbiquitous, Toast.LENGTH_SHORT).show();
            }
        });

        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, toastCapstone, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        // don't need a menu right now for this app
//        getMenuInflater().inflate(R.menu.menu_main, menu);
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
