package com.magicfruits.manedger;


public interface PreferencesManager {

    String getURL();

    void setURL(String token);


    void setMyFirstTime(Boolean flag);

    Boolean getMyFirstTime();

}
