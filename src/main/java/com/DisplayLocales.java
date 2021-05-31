package com;

import java.util.Locale;

/**
 * this method display locales using java.util.Locale
 */
public class DisplayLocales {

    public void start(){
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale locale : locales)
            System.out.println(locale.toString());
    }

}