package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Log {
    String title;
    Map<LocalDate, String> log = new HashMap<>();

    public Log(String title) {
        this.title = title;
    }

    public void enterForToday(String str) {
        log.put(LocalDate.now(), str);
    }

    public void makeEntry(LocalDate date, String str) {
        log.put(date, str);
    }

    @Override
    public String toString() {
        return "Log{" +
                "title='" + title + '\'' +
                ", log=" + log +
                '}';
    }
}
