package com.tixon.navigationbuilderapp.presenters;

import com.tixon.navigationbuilderapp.views.IAccountsView;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class AccountsPresenter implements IAccountsPresenter {
    private IAccountsView view;

    public AccountsPresenter(IAccountsView view) {
        this.view = view;
    }

    @Override
    public void createAccounts() {

    }
}
