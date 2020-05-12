package com.magicfruitsguesscolor.ui.fragments.web.presenter;




import com.magicfruitsguesscolor.ui.base.BasePresenter;
import com.magicfruitsguesscolor.ui.fragments.web.view.WebView;

import javax.inject.Inject;

public class WebPresenter extends BasePresenter<WebView> {

    @Inject
    WebPresenter(){
    }

    public void showSite() {
        getView().showSite();
    }
}
