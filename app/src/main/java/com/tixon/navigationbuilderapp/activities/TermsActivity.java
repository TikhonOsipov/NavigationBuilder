package com.tixon.navigationbuilderapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tixon.navigationbuilderapp.R;
import com.tixon.navigationbuilderapp.views.ITermsView;

public class TermsActivity extends AppCompatActivity implements ITermsView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
    }

    @Override
    public void launchActivity(Class<?> activityClass) {
        startActivity(new Intent(TermsActivity.this, activityClass));
    }
}
