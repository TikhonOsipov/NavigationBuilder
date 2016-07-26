package com.tixon.navigationbuilderapp.navigation;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class MainCoordinator implements IMainCoordinator {
    private IMainCoordinatorCallbackHandler callbackHandler;

    @Override
    public void start() {
        System.out.println("mainCoordinator started");
        System.out.println("mainCoordinator splashing");
        System.out.println("mainCoordinator start finishing");
        callbackHandler.onFinish(this);
    }

    @Override
    public void onFinish(IMainCoordinatorCallbackHandler callbackHandler) {
        this.callbackHandler = callbackHandler;
    }
}
