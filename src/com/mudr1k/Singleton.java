package com.mudr1k;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Singleton {

    private static Singleton single;
    private String time;

    private Singleton() {
        time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public String getTime() {
        return time;
    }

    public static Singleton getInstance() {
        if (single == null) {
            synchronized (Singleton.class) {
                if (single == null) {
                    single = new Singleton();
                }
            }
        }
        return single;
    }


}


