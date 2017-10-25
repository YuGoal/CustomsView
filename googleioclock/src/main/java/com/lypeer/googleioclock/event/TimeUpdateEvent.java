package com.lypeer.googleioclock.event;

/**
 * To notify time's updating .
 * Created by lypeer on 16/9/13.
 */
public class TimeUpdateEvent extends EmptyEvent {

    //year
    private final int mYearTenDigits;
    private final int mYearSingleDigits;
    private final int mYearHunDigits;
    private final int mYearThoDigits;

    //Ten and single digits of month
    private final int mMonthTenDigits;
    private final int mMonthSingleDigits;

    //Ten and single digits of day
    private final int mDayTenDigits;
    private final int mDaySingleDigits;


    //Ten and single digits of hour
    private final int mHourTenDigits;
    private final int mHourSingleDigits;

    //Ten and single digits of minute
    private final int mMinTenDigits;
    private final int mMinSingleDigits;

    //Ten and single digits of second
    private final int mSecSingleDigits;
    private final int mSecTenDigits;

    public TimeUpdateEvent(
            int yearThoDigits,
            int yearHunDigits,
            int yearTenDigits,
            int yearSingleDigits,
            int monthTenDigits,
            int monthSingleDigits,
            int dayTenDigits,
            int daySingleDigits,
            int hourTenDigits,
            int hourSingleDigits,
            int minTenDigits,
            int minSingleDigits,
            int secTenDigits,
            int secSingleDigits) {

        mYearTenDigits = yearTenDigits;
        mYearSingleDigits = yearSingleDigits;
        mYearHunDigits = yearHunDigits;
        mYearThoDigits = yearThoDigits;

        mMonthTenDigits = monthTenDigits;
        mMonthSingleDigits = monthSingleDigits;

        mDayTenDigits = dayTenDigits;
        mDaySingleDigits = daySingleDigits;

        mHourTenDigits = hourTenDigits;
        mHourSingleDigits = hourSingleDigits;
        mMinTenDigits = minTenDigits;
        mMinSingleDigits = minSingleDigits;
        mSecTenDigits = secTenDigits;
        mSecSingleDigits = secSingleDigits;
    }

    public int getMonthTenDigits() {
        return mMonthTenDigits;
    }

    public int getMonthSingleDigits(){
        return mMonthSingleDigits;
    }

    public int getDayTenDigits(){
        return mDayTenDigits;
    }

    public int getDaySingleDigits(){
        return mDaySingleDigits;
    }

    public int getYearTenDigits() {
        return mYearTenDigits;
    }

    public int getYearSingleDigits() {
        return mYearSingleDigits;
    }

    public int getYearHunDigits() {
        return mYearHunDigits;
    }

    public int getYearThoDigits() {
        return mYearThoDigits;
    }

    public int getHourTenDigits() {
        return mHourTenDigits;
    }

    public int getHourSingleDigits() {
        return mHourSingleDigits;
    }

    public int getMinTenDigits() {
        return mMinTenDigits;
    }

    public int getMinSingleDigits() {
        return mMinSingleDigits;
    }

    public int getSecSingleDigits() {
        return mSecSingleDigits;
    }

    public int getSecTenDigits() {
        return mSecTenDigits;
    }
}
