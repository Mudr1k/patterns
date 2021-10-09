package com.mudr1k;

import java.time.LocalDateTime;

public class Singleton {

    private static volatile Singleton single;
    private static final Object lock = new Object();
    private String time;

    public static Singleton getInstance() {
        if (single == null) {
            synchronized (lock) {
                if (single == null) {
                    single = new Singleton();
                }
            }
        }
        return single;
    }

    private Singleton() {
        time = LocalDateTime.now().toString();
    }

    public String getTime() {
        return time;
    }
}


