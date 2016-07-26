package com.tixon.navigationbuilderapp.presenters;

import com.tixon.navigationbuilderapp.views.ISplashView;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class SplashPresenter implements ISplashPresenter {
    private ISplashView view;

    public SplashPresenter(ISplashView view) {
        this.view = view;
    }

    @Override
    public void openNextActivity() {

    }
}
