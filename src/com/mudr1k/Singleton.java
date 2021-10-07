package com.mudr1k;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Singleton {

    public static final Singleton single = new Singleton();
    private String time;

    private Singleton() {
        time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public String getTime() {
        return time;
    }

}


