package com.example.pawans.notificationcountonactionbar;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout notificationCount1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationCount1 = (RelativeLayout) findViewById(R.id.badge_layout1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        MenuItem item1 = menu.findItem(R.id.actionbar_item);
        MenuItemCompat.setActionView(item1,R.layout.notification_update_count_layout);
        notificationCount1 = (RelativeLayout)MenuItemCompat.getActionView(item1);

        return super.onCreateOptionsMenu(menu);
    }
}
