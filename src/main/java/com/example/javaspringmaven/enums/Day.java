package com.example.javaspringmaven.enums;

public enum Day {
    MONDAY("Start of the week"), 
    TUESDAY("Second day of the week"),
    WEDNESDAY("Middle of the week"),
    THURSDAY("Almost there"), 
    FRIDAY("End of the week"),
    SATURDAY("Weekend!"),
    SUNDAY("Weekend!");

    // Fields
    private final String description;

    // Constructor
    Day(String description) {
        this.description = description;
    }

    // Method to get the description of the day
    public String getDescription() {
        return description;
    }
}
