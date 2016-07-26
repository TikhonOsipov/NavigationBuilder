package com.tixon.navigationbuilderapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationbuilderapp.R;
import com.tixon.navigationbuilderapp.app.App;
import com.tixon.navigationbuilderapp.views.ISplashView;

public class SplashActivity extends AppCompatActivity implements ISplashView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        App.get(this).getAppCoordinator().start();
    }

    @Override
    public void launchActivity(Class<?> activityClass) {
        startActivity(new Intent(SplashActivity.this, activityClass));
    }
}
