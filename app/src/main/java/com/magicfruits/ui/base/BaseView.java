package com.magicfruits.ui.base;

import android.widget.ProgressBar;

import com.magicfruits.routers.main.MainActivityRouter;


public interface BaseView {

    void showProgress(ProgressBar progressBar);

    void hideProgress(ProgressBar progressBar);

    void showMessage(String message);

    void showError(Throwable throwable, MainActivityRouter mainActivityRouter);
}
