package com.mudr1k;

public class SingletonRunner {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Singleton.single.getTime() = " + Singleton.getInstance().getTime());
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
