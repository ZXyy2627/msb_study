package com.lucky.testEnum.enum01;

import com.lucky.testEnum.enum01.Season;

public class TestSeason {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer.getSeasonName());
        System.out.println(summer);
    }
}
