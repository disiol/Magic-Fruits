package com.magicfruitsguesscolor.di.modules;


import com.magicfruitsguesscolor.di.scopes.ActivityScope;
import com.magicfruitsguesscolor.di.scopes.FragmentScope;
import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.routers.main.MainActivityRouterImpl;
import com.magicfruitsguesscolor.ui.fragments.endGame.view.EndGameFragment;
import com.magicfruitsguesscolor.ui.fragments.game.view.GameFragment;
import com.magicfruitsguesscolor.ui.fragments.start.view.StartFragment;
import com.magicfruitsguesscolor.ui.fragments.web.view.WebFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {
    @ActivityScope
    @Binds
    MainActivityRouter mainActivityRouter(MainActivityRouterImpl mainRouter);

    @FragmentScope
    @ContributesAndroidInjector
    WebFragment webFragment();

    @FragmentScope
    @ContributesAndroidInjector
    StartFragment logoFragment();

    @FragmentScope
    @ContributesAndroidInjector
    GameFragment gameFragment();

    @FragmentScope
    @ContributesAndroidInjector
    EndGameFragment endGameFragment();


}
