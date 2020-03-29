package com.magicfruits.routers.main;

public interface MainActivityRouter {

    void showLogoFragment();
    void showGameFragment();

    void showWebFragment();

    void showWinFragment(boolean flag, int points);

}
