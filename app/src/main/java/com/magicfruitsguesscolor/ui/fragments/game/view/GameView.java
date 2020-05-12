package com.magicfruitsguesscolor.ui.fragments.game.view;


import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BaseView;

public interface GameView extends BaseView {


    void showEndGame(MainActivityRouter mainActivityRouter, boolean flag, int points);

    void setPoints(int points);

    void setLifesLeft(int lifes);

    void showGameFragment(MainActivityRouter mainActivityRouter);
}
