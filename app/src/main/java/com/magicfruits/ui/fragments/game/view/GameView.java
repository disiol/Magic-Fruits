package com.magicfruits.ui.fragments.game.view;


import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BaseView;

public interface GameView extends BaseView {



    void setPoints(int points);

    void showGameFragment(MainActivityRouter mainActivityRouter);

    void setMimDilerPoints(int points);

    void mufeDiler();
}
