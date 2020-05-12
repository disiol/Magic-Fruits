package com.magicfruitsguesscolor.ui.fragments.endGame.presenter;



import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BasePresenter;
import com.magicfruitsguesscolor.ui.fragments.endGame.view.EndGameView;

import javax.inject.Inject;

public class endGamePresenter extends BasePresenter<EndGameView> {

    private MainActivityRouter mainActivityRouter;

    @Inject
    endGamePresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }


    public void newGame() {
        getView().newGame(mainActivityRouter);
    }


}
