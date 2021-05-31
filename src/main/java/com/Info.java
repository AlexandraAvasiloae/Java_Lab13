package com;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Info {

    /**
     * this method display all the details about a locale
     * @param locale
     */
    public void about(Locale locale) {
        StringBuilder sb = new StringBuilder();

        sb.append(getCountry(locale)).append("\n");
        sb.append(getLanguage(locale)).append("\n");
        sb.append(getCurrency(locale)).append("\n");
        sb.append(getWeekDays(locale)).append("\n");
        sb.append(getMonths(locale)).append("\n");
        sb.append(getToday(locale)).append("\n");

        System.out.println(sb.toString());
    }

    /**
     * this method returns country in Romanian and English
     * @param locale
     * @return
     */
    private String getCountry(Locale locale) {
        return "Country: " + locale.getDisplayCountry(Locale.US) + " (" + locale.getDisplayCountry(locale) + ")";
    }

    /**
     * this method returns language in Romanian and English
     * @param locale
     * @return
     */
    private String getLanguage(Locale locale) {
        return "Language: " + locale.getDisplayLanguage(Locale.US) + " (" + locale.getDisplayLanguage(locale) + ")";
    }

    /**
     *
     * this method returns currency in Romanian and English
     * @param locale
     * @return
     */
    private String getCurrency(Locale locale) {
        Currency currency = Currency.getInstance(locale);
        return "Currency: " + currency.getCurrencyCode() + " (" + currency.getDisplayName()  + ")";
    }

    /**
     * this method returns the week day in that country language
     * @param locale
     * @return
     */
    private String getWeekDays(Locale locale) {
        StringBuilder weekDaysReturnString = new StringBuilder();
        String[] weekDays = DateFormatSymbols.getInstance(locale).getWeekdays();

        weekDaysReturnString.append("Week Days: ");
        weekDaysReturnString.append(weekDays[1]);
        for(int i = 2; i < weekDays.length; i++)
            weekDaysReturnString.append(", ").append(weekDays[i]);
        return weekDaysReturnString.toString();
    }

    /**
     * this method return the months in that country language
     * @param locale
     * @return
     */
    private String getMonths(Locale locale) {
        StringBuilder monthsReturnString = new StringBuilder();
        String[] months = DateFormatSymbols.getInstance(locale).getMonths();

        monthsReturnString.append("Months: ");
        monthsReturnString.append(months[0]);
        for(int i = 1; i < months.length - 1; i++)
            monthsReturnString.append(", ").append(months[i]);

        return monthsReturnString.toString();
    }

    /**
     * this method returns current date
     * @param locale
     * @return
     */
    private String getToday(Locale locale) {
        return "Today: " + DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(new Date())
                + " (" + DateFormat.getDateInstance(DateFormat.LONG, locale).format(new Date()) + ")";
    }
}