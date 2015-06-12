package org.example.myappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.spotify_app_title));
            }
        });

        Button scoresButton = (Button) findViewById(R.id.scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.scores_app_toast));
            }
        });


        Button libraryButton = (Button) findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.library_app_toast));
            }
        });


        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.build_it_bigger_title));
            }
        });


        Button xyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.xyz_reader_title));
            }
        });


        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.capstone_toast));
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

    private void makeToast(String appName) {
        Resources res = getResources();
        String text = String.format(res.getString(R.string.toast_message), appName);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
