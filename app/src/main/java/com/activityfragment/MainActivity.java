package com.activityfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private String activityString = "";
    private final String TAG = "MainActivity";
    private static MainActivity mainActivity;



    public String getActivityString() {
        return activityString;
    }

    public void setActivityString(String activityString) {
        this.activityString = activityString;
    }
    //bu classtan nesne oluşturma demek.
    // private MainActivity(){}
    //object creation
    //public static MainActivity newInstance() {
    //   if (mainActivity != null)
    //      return mainActivity;
    //  else {
    //     mainActivity = new MainActivity();
    //    return mainActivity;
    // }
    // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtTitle = (TextView) findViewById(R.id.activity_main_txtTitle);
        Log.e(TAG, "onCreate");
        Fragment newFragment = new SecondFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.activity_main_frm_SecondFragment, newFragment).commit();

        FragmentManager fragmentManager = getFragmentManager();
        MainFragment fragment = (MainFragment) fragmentManager.findFragmentById(R.id.activity_main_frgMainFragment);
        txtTitle.setText(fragment.getPassedData());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

}
