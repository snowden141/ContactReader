package com.example.shobh.contactreader;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.LoaderManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.example.shobh.contactreader.IndexList.FragmentInteractionListener;

public class MainActivity extends FragmentActivity implements FragmentInteractionListener {

    private android.support.v4.app.FragmentManager fragmentManager;
    private Fragment fragment;
    private FrameLayout f1,f2;
    private android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();
        fragment=new IndexList();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fcontainer,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void itemClicked(int position) {

        fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 1:
                fragment = new AtoE();
                break;

            case 2:
                fragment = new FtoJ();
                break;

            case 3:
                fragment = new KtoO();
                break;

            case 4:
                fragment = new PtoT();
                break;

            case 5:
                fragment = new UtoZ();
                break;
        }
        fragmentTransaction=fragmentManager.beginTransaction();
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
            fragmentTransaction.replace(R.id.fcontainer,fragment);
        else
            fragmentTransaction.replace(R.id.fcontainer,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
