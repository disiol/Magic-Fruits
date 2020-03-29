package com.magicfruits.ui.fragments.game.view;


import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BaseView;

public interface GameView extends BaseView {


    void showEndGame(MainActivityRouter mainActivityRouter, boolean flag, int points);

    void setPoints(int points);

    void setLifesLeft(int lifes);

    void showGameFragment(MainActivityRouter mainActivityRouter);
}
