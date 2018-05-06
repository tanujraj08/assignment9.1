package com.tanuj.colorchange;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtPageTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPageTitle = (TextView) findViewById(R.id.txtPageTitle);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals(ColorEnum.AppColours.Red.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
        else if (item.getTitle().equals(ColorEnum.AppColours.Green.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
        else if (item.getTitle().equals(ColorEnum.AppColours.Blue.toString()))
            txtPageTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorBlue));
        return true;
    }
}
