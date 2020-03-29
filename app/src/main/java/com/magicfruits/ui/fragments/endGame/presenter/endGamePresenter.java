package com.magicfruits.ui.fragments.endGame.presenter;



import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BasePresenter;
import com.magicfruits.ui.fragments.endGame.view.EndGameView;

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
