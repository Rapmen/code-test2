package com.example.codetest2;

import lombok.Getter;

public enum Orientation {
    N("North", "E", "W"), S("South", "W", "E"), E("East", "S", "N"), W("West", "N", "S");

    @Getter
    private String name;

    @Getter
    private String clockwise;

    @Getter
    private String anticlockwise;

    Orientation(String name, String clockwise, String anticlockwise) {
        this.name = name;
        this.clockwise = clockwise;
        this.anticlockwise = anticlockwise;
    }

    @Override
    public String toString() {
        return name;
    }
}
