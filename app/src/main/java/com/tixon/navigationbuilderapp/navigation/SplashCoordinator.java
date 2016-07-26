package com.tixon.navigationbuilderapp.navigation;

/**
 * Created by tikhon.osipov on 26.07.2016
 */
public class SplashCoordinator implements ISplashCoordinator {
    private ISplashCoordinatorCallbackHandler callbackHandler;

    @Override
    public void start() {
        System.out.println("testSplashCoordinator started");
        System.out.println("testSplashCoordinator splashing");
        System.out.println("testSplashCoordinator start finishing");
        Thread t = new Thread(r);
        t.start();
    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                callbackHandler.onFinish(SplashCoordinator.this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    @Override
    public void onFinish(ISplashCoordinatorCallbackHandler callbackHandler) {
        this.callbackHandler = callbackHandler;
    }
}
