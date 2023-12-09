package com.scaler.greetings;

public class Greetings {
    public String greet() {
        int hour = java.time.LocalTime.now().getHour();
        if (hour >= 12 && hour <16) {
            return "Good Afternoon";

        } else if (hour >= 16 && hour <=20) {
            return "Good Evening";

        }
        else if (hour > 20 && hour <= 24) {
            return "Good Night";

        }
        else {
            return "Good Morning";
        }
    }
}

