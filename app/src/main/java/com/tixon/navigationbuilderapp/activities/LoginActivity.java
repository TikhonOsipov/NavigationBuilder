package com.tixon.navigationbuilderapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationbuilderapp.R;
import com.tixon.navigationbuilderapp.views.ILoginView;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void launchActivity(Class<?> activityClass) {
        startActivity(new Intent(LoginActivity.this, activityClass));
    }
}
