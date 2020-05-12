package com.magicfruitsguesscolor.ui.fragments.game.presenter;


import android.util.Log;


import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BasePresenter;
import com.magicfruitsguesscolor.ui.fragments.game.view.GameView;

import javax.inject.Inject;

import static com.magicfruitsguesscolor.constants.Constants.MYLOG_TEG;


public class GamePresenter extends BasePresenter<GameView> {
    private static final int ForMatches = 10;
    private int lifes = 5;
    private int caynterMatches;
    private int namber;
    private int points;
    private MainActivityRouter mainActivityRouter;

    @Inject
    GamePresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }

    public void chakForMathes(boolean mathes) {

        if (mathes) {
            caynterMatches++;
            points++;
            getView().setPoints(points);
            Log.d(MYLOG_TEG, "caynterMatches " + caynterMatches);
        }

        if (!mathes) {

            if (points != 0) {
                points--;
            }
            getView().setPoints(points);


            if (lifes == 0) {
                getView().showEndGame(mainActivityRouter, false, points);
            } else {
                lifes--;
                getView().setLifesLeft(lifes);

            }

            Log.d(MYLOG_TEG, "Upss " + caynterMatches);
        }

        if (caynterMatches == ForMatches) {
            getView().showEndGame(mainActivityRouter, true, points);
        }
    }


    public int getNamber() {
        Log.d(MYLOG_TEG, "getNamber " + namber);
        return namber;

    }


    public void setNaber(int i) {
        namber = i;

        Log.d(MYLOG_TEG, "setNaber " + namber);
    }

    public void newGame() {
        getView().showGameFragment(mainActivityRouter);
    }
}
