package com.magicfruitsguesscolor.di.modules;


import com.magicfruitsguesscolor.di.scopes.ActivityScope;
import com.magicfruitsguesscolor.ui.activities.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, ApiModule.class, AppModule.class, ManagersModule.class})
public interface ApplicationModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();


}
