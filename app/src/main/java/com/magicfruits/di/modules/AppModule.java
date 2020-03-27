package com.magicfruits.di.modules;


import com.google.gson.Gson;
import com.magicfruits.api.Api;
import com.magicfruits.interactor.DataStore;

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
