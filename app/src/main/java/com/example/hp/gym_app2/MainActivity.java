package com.example.hp.gym_app2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private String titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//
//    }

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


        if (id == R.id.action_exit) {
           return true;  }



        if (id == R.id.action_share) {
            return true;
        }
        if (id == R.id.action_fb) {
            return true;
        }
        if (id == R.id.action_twitter) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment=null;

        if (id == R.id.nav_home) {
            fragment=new home();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();
            //frame_container open the fragment and fragment open the about

            // Handle the camera action
        } else if (id == R.id.nav_about) {
            fragment=new about();
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        }  else if (id == R.id.nav_media) {
            fragment=new media();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        } else if (id == R.id.nav_magazines) {
            fragment=new magazines();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        }else if (id == R.id.nav_services) {
            fragment=new services();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        } else if (id == R.id.nav_gallery) {
            fragment=new gallery();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        } else if (id == R.id.nav_supplement) {
            fragment=new supple();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();

        } else if (id == R.id.nav_admission) {
            fragment=new admission();
            //about is new xml file that opened
            android.app.FragmentManager fm1=getFragmentManager();
            //fragmentmanager open the about  //fm1 is instance
            android.app.FragmentTransaction ft1=fm1.beginTransaction();
            //ft1 is fragment transaction
            fm1.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(null).commit();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setTitleBar(String titleBar) {
        this.titleBar = titleBar;
    }
}
