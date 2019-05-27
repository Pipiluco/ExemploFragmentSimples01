package org.sistemafiesc.lucasftecnico.exemplofragmentsimples01;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFragment(View view) {
        Fragment fragment;

        if (view == findViewById(R.id.btnFragment01)) {
            fragment = new Fragment01();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fgMain, fragment);
            fragmentTransaction.commit();
        }
        if (view == findViewById(R.id.btnFragment02)) {
            fragment = new Fragment02();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fgMain, fragment);
            fragmentTransaction.commit();
        }

    }
}
