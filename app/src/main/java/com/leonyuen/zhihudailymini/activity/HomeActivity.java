package com.leonyuen.zhihudailymini.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.leonyuen.zhihudailymini.R;

/**
 * Created by leon-yuen on 16-4-11.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolBar = (Toolbar)findViewById(R.id.tool_bar);
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        toolBar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolBar);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolBar,
                R.string.action_settings,
                R.string.app_name
        );

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle actionBarDrawerToggle1 = new ActionBarDrawerToggle(this, drawerLayout, R.string.action_settings, R.string.app_name);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
    }
}
