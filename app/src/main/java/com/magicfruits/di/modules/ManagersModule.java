package com.magicfruits.di.modules;

import android.content.Context;

import com.magicfruits.manedger.PreferencesManager;
import com.magicfruits.manedger.PreferencesManagerImpl;

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
