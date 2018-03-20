package com.example.android.miwok;

import android.content.Context;
import android.view.View;

/**
 * Created by ME on 3/12/2018.
 */

public class Word {

    //String for the default language translation (users native/familiar language)
    private String nDefaultTranslation;

    //String for the Miwok language translation
    private String nMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        nDefaultTranslation = defaultTranslation;
        nMiwokTranslation = miwokTranslation;
    }
    
    //Gets the default language translation
    public String getnDefaultTranslation(){
        return nDefaultTranslation;
    }

    //Gets the Miwok language translation
    public String getnMiwokTranslation(){
        return nMiwokTranslation;
    }

}
