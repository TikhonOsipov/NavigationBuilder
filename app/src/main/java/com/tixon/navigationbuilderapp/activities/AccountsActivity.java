package com.tixon.navigationbuilderapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationbuilderapp.R;
import com.tixon.navigationbuilderapp.presenters.AccountsPresenter;
import com.tixon.navigationbuilderapp.presenters.IAccountsPresenter;
import com.tixon.navigationbuilderapp.views.IAccountsView;

public class AccountsActivity extends AppCompatActivity implements IAccountsView {
    private IAccountsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        presenter = new AccountsPresenter(this);
    }

    @Override
    public void launchActivity(Class<?> activityClass) {
        startActivity(new Intent(AccountsActivity.this, activityClass));
    }
}
