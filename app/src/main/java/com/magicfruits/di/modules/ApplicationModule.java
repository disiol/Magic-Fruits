package com.magicfruits.di.modules;


import com.magicfruits.di.scopes.ActivityScope;
import com.magicfruits.ui.activities.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, ApiModule.class, AppModule.class, ManagersModule.class})
public interface ApplicationModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();


}
