package com.tixon.navigationbuilderapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tixon.navigationbuilderapp.R;
import com.tixon.navigationbuilderapp.presenters.IMainPresenter;
import com.tixon.navigationbuilderapp.presenters.MainPresenter;
import com.tixon.navigationbuilderapp.views.IMainView;

public class MainActivity extends AppCompatActivity implements IMainView {
    private IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);

        Button button = (Button) findViewById(R.id.buttonMain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void launchActivity(Class<?> activityClass) {
        startActivity(new Intent(MainActivity.this, activityClass));
    }
}
