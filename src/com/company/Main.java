package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "  Hello World" + "!!  \"Richard\"";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.trim());
    }
}
