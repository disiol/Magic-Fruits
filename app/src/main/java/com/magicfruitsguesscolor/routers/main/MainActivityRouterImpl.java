package com.magicfruitsguesscolor.routers.main;


import android.os.Bundle;

import com.magicfruitsguesscolor.R;
import com.magicfruitsguesscolor.routers.base.BaseRouter;
import com.magicfruitsguesscolor.ui.activities.MainActivity;
import com.magicfruitsguesscolor.ui.fragments.endGame.view.EndGameFragment;
import com.magicfruitsguesscolor.ui.fragments.game.view.GameFragment;
import com.magicfruitsguesscolor.ui.fragments.start.view.StartFragment;
import com.magicfruitsguesscolor.ui.fragments.web.view.WebFragment;

import javax.inject.Inject;

import static com.magicfruitsguesscolor.ui.fragments.endGame.view.EndGameFragment.POINTS;
import static com.magicfruitsguesscolor.ui.fragments.endGame.view.EndGameFragment.WIN;


public class MainActivityRouterImpl extends BaseRouter<MainActivity> implements MainActivityRouter {


    @Inject
    MainActivityRouterImpl(MainActivity activity) {
        super(activity);
    }

    @Override
    public void showGameFragment() {
        if (!isCurrentFragment(R.id.fragment_container, GameFragment.class)) {
            replaceFragment(R.id.fragment_container, new GameFragment());
        }
    }


    @Override
    public void showLogoFragment() {
        if (!isCurrentFragment(R.id.fragment_container, StartFragment.class)) {
            replaceFragment(R.id.fragment_container, new StartFragment());
        }
    }
    @Override
    public void showWebFragment() {
        if(!isCurrentFragment(R.id.fragment_container, WebFragment.class)) {
            replaceFragment(R.id.fragment_container, new WebFragment());
        }
    }

    @Override
    public void showWinFragment(boolean flag, int points) {
        if (!isCurrentFragment(R.id.fragment_container, EndGameFragment.class)) {
            Bundle fragmentBundle = new Bundle();
            fragmentBundle.putBoolean(WIN, flag);
            fragmentBundle.putString(POINTS, String.valueOf(points));

            EndGameFragment fragment = new EndGameFragment();
            fragment.setArguments(fragmentBundle);
            replaceFragment(R.id.fragment_container, fragment);
        }
    }

}
