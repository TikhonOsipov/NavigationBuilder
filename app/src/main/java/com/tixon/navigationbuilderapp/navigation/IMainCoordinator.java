package com.tixon.navigationbuilderapp.navigation;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public interface IMainCoordinator {
    void start();
    void onFinish(IMainCoordinatorCallbackHandler callbackHandler);
}
