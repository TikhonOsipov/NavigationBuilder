package com.tixon.navigationbuilderapp.app;

import android.app.Application;
import android.content.Context;

import com.tixon.navigationbuilderapp.navigation.ApplicationCoordinator;
import com.tixon.navigationbuilderapp.navigation.ICoordinator;
import com.tixon.navigationbuilderapp.navigation.IMainCoordinator;
import com.tixon.navigationbuilderapp.navigation.ISplashCoordinator;
import com.tixon.navigationbuilderapp.navigation.MainCoordinator;
import com.tixon.navigationbuilderapp.navigation.SplashCoordinator;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class App extends Application {
    private ISplashCoordinator splashCoordinator;
    private IMainCoordinator mainCoordinator;

    private ICoordinator appCoordinator;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public ICoordinator getAppCoordinator() {
        return appCoordinator;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        splashCoordinator = new SplashCoordinator();
        mainCoordinator = new MainCoordinator();
        appCoordinator = new ApplicationCoordinator(splashCoordinator, mainCoordinator);
    }
}
