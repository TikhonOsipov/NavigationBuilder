package com.tixon.navigationbuilderapp.presenters;

import com.tixon.navigationbuilderapp.views.ITermsView;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class TermsPresenter implements ITermsPresenter {
    private ITermsView view;

    public TermsPresenter(ITermsView view) {
        this.view = view;
    }

    @Override
    public void accept() {

    }

    @Override
    public void decline() {

    }
}
