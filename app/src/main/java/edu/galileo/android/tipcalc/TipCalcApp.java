package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by JuanCrg90
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://juancrg90.me";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
