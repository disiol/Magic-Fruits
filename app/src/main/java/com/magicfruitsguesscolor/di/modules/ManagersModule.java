package com.magicfruitsguesscolor.di.modules;

import android.content.Context;

import com.magicfruitsguesscolor.manedger.PreferencesManager;
import com.magicfruitsguesscolor.manedger.PreferencesManagerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ManagersModule {

    @Provides
    @Singleton
    PreferencesManager providePreferencesManager(Context context){
        return new PreferencesManagerImpl(context);
    }


}
