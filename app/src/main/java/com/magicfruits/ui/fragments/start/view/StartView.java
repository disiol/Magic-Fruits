package com.magicfruits.ui.fragments.start.view;


import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BaseView;

public interface StartView extends BaseView {

    void showGame(MainActivityRouter mainActivityRouter);

    void showWeb(MainActivityRouter mainActivityRouter);
}
