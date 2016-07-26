package com.tixon.navigationbuilderapp.navigation;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class ApplicationCoordinator implements
        ICoordinator,
        ISplashCoordinatorCallbackHandler,
        IMainCoordinatorCallbackHandler {
    private ISplashCoordinator splashCoordinator;
    private IMainCoordinator mainCoordinator;

    public ApplicationCoordinator(ISplashCoordinator splashCoordinator, IMainCoordinator mainCoordinator) {
        this.splashCoordinator = splashCoordinator;
        splashCoordinator.onFinish(this);

        this.mainCoordinator = mainCoordinator;
        mainCoordinator.onFinish(this);
    }

    @Override
    public void start() {
        splashCoordinator.start();
    }

    @Override
    public void onFinish(ISplashCoordinator finishedCoordinator) {
        mainCoordinator.start();
    }

    @Override
    public void onFinish(IMainCoordinator finishedCoordinator) {

    }
}
