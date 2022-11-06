package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Task {
    public static void dayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("День недели - " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("Ru")));
    }

    public static void tuesday(int year, int month, int day) {
        LocalDate tuesday = LocalDate.of(year, month, day);
        if (tuesday.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(8));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusWeeks(1));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(6));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(5));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(4));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(3));
        } else if (tuesday.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            System.out.println("Следующий вторник " + tuesday.plusDays(2));
        }
    }

}


