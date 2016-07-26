package com.tixon.navigationbuilderapp.presenters;

import com.tixon.navigationbuilderapp.views.IMainView;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class MainPresenter implements IMainPresenter {
    private IMainView view;

    public MainPresenter(IMainView view) {
        this.view = view;
    }

    @Override
    public void goToLogin() {

    }
}
