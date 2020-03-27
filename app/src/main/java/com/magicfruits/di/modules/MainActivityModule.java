package com.magicfruits.di.modules;


import com.magicfruits.di.scopes.ActivityScope;
import com.magicfruits.di.scopes.FragmentScope;
import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.routers.main.MainActivityRouterImpl;
import com.magicfruits.ui.fragments.game.view.GameFragment;
import com.magicfruits.ui.fragments.start.view.StartFragment;
import com.magicfruits.ui.fragments.web.view.WebFragment;

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



}
