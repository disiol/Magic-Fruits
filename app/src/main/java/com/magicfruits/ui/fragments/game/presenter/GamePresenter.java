package com.magicfruits.ui.fragments.game.presenter;


import android.util.Log;
import android.widget.ImageView;


import com.magicfruits.R;
import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BasePresenter;
import com.magicfruits.ui.fragments.game.view.GameView;

import javax.inject.Inject;

import static com.magicfruits.constants.Constants.MYLOG_TEG;


public class GamePresenter extends BasePresenter<GameView> {
    private static final int ForMatches = 10;
    private final String messageLose = "Daler win";
    private final String winMessage = "You win";
    private int lifes = 5;
    private int caynterMatches;
    private int dilerPoints = 17;
    private int points;
    private int userPoints;
    private MainActivityRouter mainActivityRouter;
    private int cauterOfTuze;
    private int mimesSuresIfpointsBig;
    private int mastMinus;

    @Inject
    GamePresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }

    public void setPointsAndCheakForWin(int imageResource, ImageView deackImageView, String flag, int minPointsDiler) {


        if (imageResource == R.drawable.bub_2 && points <= 21) {
            points = points + 2;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_3 && points <= 21) {
            points = points + 3;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_4 && points <= 21) {
            points = points + 4;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_5 && points <= 21) {
            points = points + 5;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_6 && points <= 21) {
            points = points + 6;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_7 && points <= 21) {
            points = points + 7;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_8 && points <= 21) {
            points = points + 8;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_9 && points <= 21) {
            points = points + 9;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_10 && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_j && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_q && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.bub_k && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.bub_a && points <= 21) {
            if ((points + 11) < 21) {
                cauterOfTuze++;
                points = points + 11;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);
            } else {
                cauterOfTuze++;
                points = points + 11;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);
            }

        } else if (imageResource == R.drawable.c_2 && points <= 21) {
            points = points + 2;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_3 && points <= 21) {
            points = points + 3;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_4 && points <= 21) {
            points = points + 4;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_5 && points <= 21) {
            points = points + 5;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_6 && points <= 21) {
            points = points + 6;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_7 && points <= 21) {
            points = points + 7;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_8 && points <= 21) {
            points = points + 8;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_9 && points <= 21) {
            points = points + 9;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_10 && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_j && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_q && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_k && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.c_a && points <= 21) {
            if ((points + 11) < 21) {
                points = points + 11;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);
            } else {
                points = points + 1;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);
            }

        } else if (imageResource == R.drawable.k_2 && points <= 21) {
            points = points + 2;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_3 && points <= 21) {
            points = points + 3;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_4 && points <= 21) {
            points = points + 4;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_5 && points <= 21) {
            points = points + 5;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_6 && points <= 21) {
            points = points + 6;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_7 && points <= 21) {
            points = points + 7;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_8 && points <= 21) {
            points = points + 8;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_9 && points <= 21) {
            points = points + 9;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_10 && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);
        } else if (imageResource == R.drawable.k_j && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.k_q && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.k_k && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.k_a && points <= 21) {
            if ((points + 11) < 21) {
                points = points + 11;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);

            } else {
                points = points + 1;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);

            }

        } else if (imageResource == R.drawable.p_2 && points <= 21) {
            points = points + 2;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_3 && points <= 21) {
            points = points + 3;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_4 && points <= 21) {
            points = points + 4;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_5 && points <= 21) {
            points = points + 5;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_6 && points <= 21) {
            points = points + 6;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_7 && points <= 21) {
            points = points + 7;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_8 && points <= 21) {
            points = points + 8;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_9 && points <= 21) {
            points = points + 9;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_10 && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_j && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
        } else if (imageResource == R.drawable.p_q && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);

        } else if (imageResource == R.drawable.p_k && points <= 21) {
            points = points + 10;
            getView().setPoints(points);
            cheekForLoose(deackImageView, flag, minPointsDiler);


        } else if (imageResource == R.drawable.p_a && points <= 21) {
            if ((points + 11) < 21) {
                points = points + 11;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);

            } else {
                points = points + 1;
                cauterOfTuze++;
                getView().setPoints(points);
                cheekForLoose(deackImageView, flag, minPointsDiler);

            }

        }


    }

    private void cheekForLoose(ImageView deackImageView, String flag, int minPointsDiler) {
        Log.d(MYLOG_TEG, "cheekForLoose flag " + flag);

        if (flag.equals("user")) {
            chekWinUser(deackImageView);
        } else if (flag.equals("diler")) {
            cheekForDilerWin(points, minPointsDiler);
            //TODO
        }
    }

    private void chekWinUser(ImageView deackImageView) {


        Log.d(MYLOG_TEG, "chekWinUser");
        Log.d(MYLOG_TEG, "points = " + points);
        cheakTuze();

        if (points > 21) {

            deackImageView.setClickable(false);
            getView().mufeDiler();
            getView().showMessage(messageLose);
        } else if (points == 21) {
            deackImageView.setClickable(false);
            getView().mufeDiler();
            getView().showMessage(winMessage);
        }
    }

    private void cheakTuze() {
        if (cauterOfTuze > 0) {

            if (points > 21) {

                for (int i = cauterOfTuze; i > 1; i --) {
                    mimesSuresIfpointsBig = 11;
                    points = points - 11;
                    points++;
                }
            }
            getView().setPoints(points);

        }
    }


    public void newGame() {
        getView().showGameFragment(mainActivityRouter);
    }

    private void cheekForDilerWin(int points, int minPointsDiler) {
        Log.d(MYLOG_TEG, "cheekForDilerWin");
        cheakTuze();

        if (points <= userPoints && userPoints < 21 || points > 21) {

            Log.d(MYLOG_TEG, "userPoints = " + userPoints);
            Log.d(MYLOG_TEG, "points = " + points);

            getView().setPoints(userPoints);
            getView().setMimDilerPoints(points);

            if (points >= minPointsDiler) {
                getView().showMessage(winMessage);
            }

        } else {
            Log.d(MYLOG_TEG, "userPoints = " + userPoints);
            Log.d(MYLOG_TEG, "points = " + points);

            getView().setPoints(userPoints);
            getView().setMimDilerPoints(points);

            if (points >= minPointsDiler) {
                getView().showMessage(messageLose);
            }

        }

    }

    public void safeUsrPoints() {
        this.userPoints = points;
    }

    public void resetPoints() {
        points = 0;
    }
}
