package com.example.codetest2.vehicle;

import com.example.codetest2.behavior.TurnAction;
import com.example.codetest2.locale.Locale;
import com.example.codetest2.location.Orientation;
import com.example.codetest2.location.Position;

import lombok.Getter;
import lombok.Setter;

public abstract class Vehicle {

    @Getter
    @Setter
    private String owner;

    @Getter
    @Setter
    private Locale locale;

    @Getter
    @Setter
    private Position position;

    @Getter
    @Setter
    private Orientation orientation;

    abstract void move() throws Exception;

    abstract void turn(TurnAction ta);

    public Vehicle(String owner, Locale locale, int x, int y, Orientation orientation) {
        this.owner = owner;
        this.locale = locale;
        this.orientation = orientation;
        this.position = new Position(x, y);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "owner='" + owner + '\'' + ", locale=" + locale.getName() + ", position=" + position
            + ", orientation=" + orientation + '}';
    }

    public void noticeLocale() throws Exception {
        // do nothing
    }
}
