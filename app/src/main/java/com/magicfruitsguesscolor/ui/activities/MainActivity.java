package com.magicfruitsguesscolor.ui.activities;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.applinks.AppLinkData;
import com.magicfruitsguesscolor.BuildConfig;
import com.magicfruitsguesscolor.R;
import com.magicfruitsguesscolor.manedger.PreferencesManager;
import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BaseActivity;

import javax.inject.Inject;

import static com.magicfruitsguesscolor.constants.Constants.DEPLINK;


public class MainActivity extends BaseActivity {

    @Inject
    MainActivityRouter mainActivityRouter;
    @Inject
    PreferencesManager preferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();

        if (preferencesManager.getMyFirstTime()) {
            try {

                AppLinkData.fetchDeferredAppLinkData(this, appLinkData -> {
                    AppLinkData appLinkData1 = appLinkData;
                    if (appLinkData1 == null || appLinkData1.getTargetUri() == null) {
                        Log.e("MyLog", "deeplink = null");
                        mainActivityRouter.showLogoFragment();


                    } else {

                        String url = appLinkData1.getTargetUri().toString();
                        if (BuildConfig.DEBUG) {
                            Log.d("MyLog", "deeplink = " + url);

                            Log.d("my Log" + this.getLocalClassName(), "App Link appLinkData: " + url);
                        }
                        String string = convertArrayToStringMethod(url.split(DEPLINK));

                        if (BuildConfig.DEBUG) {
                            Log.d("MyLog" + this.getLocalClassName(), "App Link appLinkData url: " + url);

                            Log.d("MyLog" + this.getLocalClassName(), "App Link appLinkData string: " + string);
                        }


                        preferencesManager.setURL(string);
                        mainActivityRouter.showLogoFragment();

                    }
                });
            } catch (Exception e) {
                Log.e("my Log" + this.getLocalClassName(), "App Link appLinkData: " + e.toString());

                e.printStackTrace();
            }
        } else if (!preferencesManager.getMyFirstTime()){
            mainActivityRouter.showLogoFragment();

        }


    }

    public static String convertArrayToStringMethod(String[] strArray) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {

            stringBuilder.append(strArray[i]);

        }

        return stringBuilder.toString();

    }


}
