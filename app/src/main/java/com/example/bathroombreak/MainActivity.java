package com.example.bathroombreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void urine(View view) {
        // add the current date and time to a database
    }

    public void excrement(View view) {
        // add the current date and time to a database
    }

    public void stats(View view) {
        // go to new page
        // on the new page, get the data from all the databases and print it to the screen
    }
}
