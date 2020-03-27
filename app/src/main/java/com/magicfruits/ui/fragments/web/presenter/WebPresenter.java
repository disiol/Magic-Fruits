package com.magicfruits.ui.fragments.web.presenter;




import com.magicfruits.ui.base.BasePresenter;
import com.magicfruits.ui.fragments.web.view.WebView;

import javax.inject.Inject;

public class WebPresenter extends BasePresenter<WebView> {

    @Inject
    WebPresenter(){
    }

    public void showSite() {
        getView().showSite();
    }
}
