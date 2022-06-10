package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Log complaints = new Log("Daily Complaints");
        Log gratitude = new Log("Gratitude Journal");
        gratitude.enterForToday("Yogurt in breakfast.");
        complaints.enterForToday("It's cloudy");
        complaints.makeEntry(LocalDate.of(2022, 06, 8), "No more churros");
        System.out.println(gratitude);
        System.out.println(complaints);
        //Use the LocalDate.of() function to make a date.
    }
}
