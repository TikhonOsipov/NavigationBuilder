package com.tixon.navigationbuilderapp.presenters;

import com.tixon.navigationbuilderapp.views.ILoginView;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class LoginPresenter implements ILoginPresenter {
    private ILoginView view;

    public LoginPresenter(ILoginView view) {
        this.view = view;
    }

    @Override
    public void login() {

    }
}
