package com.magicfruitsguesscolor.di.modules;


import com.google.gson.Gson;
import com.magicfruitsguesscolor.api.Api;
import com.magicfruitsguesscolor.interactor.DataStore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    DataStore provideDataStore(Api api, Gson gson) {
        return new DataStore(api, gson);
    }
}
