package com.edwinacubillos.dccomics;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        FlashFragment fragment = new FlashFragment();
    //    ft.add(android.R.id.content, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (id == R.id.mBatman){
            BatmanFragment fragment = new BatmanFragment();
        //    ft.replace(android.R.id.content, fragment).commit();
        }
        if (id == R.id.mFlash) {
            FlashFragment fragment = new FlashFragment();
        //    ft.replace(android.R.id.content, fragment).commit();
        }
        if (id == R.id.mSuperman) {
            SupermanFragment fragment = new SupermanFragment();
        //    ft.replace(android.R.id.content, fragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
