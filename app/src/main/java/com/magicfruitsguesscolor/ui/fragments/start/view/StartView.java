package com.magicfruitsguesscolor.ui.fragments.start.view;


import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BaseView;

public interface StartView extends BaseView {

    void showGame(MainActivityRouter mainActivityRouter);

    void showWeb(MainActivityRouter mainActivityRouter);
}
