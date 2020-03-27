package com.magicfruits.routers.main;


import com.magicfruits.R;
import com.magicfruits.routers.base.BaseRouter;
import com.magicfruits.ui.activities.MainActivity;
import com.magicfruits.ui.fragments.game.view.GameFragment;
import com.magicfruits.ui.fragments.start.view.StartFragment;
import com.magicfruits.ui.fragments.web.view.WebFragment;

import javax.inject.Inject;


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

}
