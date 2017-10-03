package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        {


            private boolean isUserClickedBackButton=false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Welcome Foodie",Toast.LENGTH_SHORT).show();
       // Toast toast=Toast.makeText(MainActivity.this,"Welcome Foodie",Toast.LENGTH_LONG);toast.setGravity(Gravity.CENTER,0,0);toast.show();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //toolbar.setTitle("food");
toolbar.setLogo(R.drawable.test);
        //  getSupportActionBar().setDisplayShowHomeEnabled(true);
       // ActionBar actionBar=getActionBar();
       // actionBar.setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.f);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);
       //actionBar.setIcon(R.drawable.f);
       ;

        ArrayList<SpinnerBean> list = new ArrayList<>();

        list.add(new SpinnerBean("------------SELECT CITY----------"));
        list.add(new SpinnerBean(">     LUDHIANA"));
        list.add(new SpinnerBean(">     CHANDIGARH"));
        list.add(new SpinnerBean(">     JALANDHAR"));
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        final SpinnerAdapter adapter = new SpinnerAdapter(this, R.layout.spinner_layout, R.id.txt, list);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object value;
                value = parent.getItemAtPosition(position);
                switch (position) {

                        case 1:
                            Intent i = new Intent(MainActivity.this, LudhianaHotelList.class);
                            startActivity(i);
                            break;
                        case 2:
                            Intent i2 = new Intent(MainActivity.this, ChandigarhHotelList.class);
                            startActivity(i2);
                            break;
                        case 3:
                            Intent i3 = new Intent(MainActivity.this, JalandharHotelList.class);
                            startActivity(i3);
                            break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//    }
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
  }

            @Override
            public void onBackPressed() {

                if (!isUserClickedBackButton){
                    Toast.makeText(this,"Press back again to exit",Toast.LENGTH_LONG).show();
                    isUserClickedBackButton=true;
                }else {

                    super.onBackPressed();
                }

                new CountDownTimer(3000,1000){

                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {

                        isUserClickedBackButton=false;

                    }
                }.start();




            }
            //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

        }
