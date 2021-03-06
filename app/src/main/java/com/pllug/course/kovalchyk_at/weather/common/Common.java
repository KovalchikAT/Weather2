package com.pllug.course.kovalchyk_at.weather.common;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kovalchyk_at on 27.02.2018.
 */

public class Common {
    public static String API_KEY = "fa1f58f3f03c033ca2684fa030bb70d5";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String city, String language, String units){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?q=%s&lang=%s&APPID=%s&units=%s",city,language,API_KEY,units));
        return sb.toString();
    }
    @NonNull
    public static String apiRequest(String lat, String lon, String language, String units){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&lang=%s&APPID=%s&units=%s",lat,lon,language,API_KEY,units));
        return sb.toString();
    }

      public static String unixTimeStampToDateTime(double unixTimeStamp){
          DateFormat dateFormat = new SimpleDateFormat("HH:mm");
          Date date = new Date();
          date.setTime((long)unixTimeStamp*1000 );
          return  dateFormat.format(date);
      }

      public static String getImage (String icon){
            return String.format("http://openweathermap.org/img/w/%s.png", icon);
      }

      public static String getDateNow(){
          DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy  HH:mm");
          Date date = new Date();
          return dateFormat.format(date);
      }
}
