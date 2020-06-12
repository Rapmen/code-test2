package com.example.codetest2.vehicle;

import com.example.codetest2.behavior.TurnAction;
import com.example.codetest2.locale.Locale;
import com.example.codetest2.location.Orientation;
import com.example.codetest2.location.Position;

public class Car extends Vehicle {

    public Car(String owner, Locale locale, int x, int y, Orientation orientation) {
        super(owner, locale, x, y, orientation);
    }

    @Override
    public void move() throws Exception {
        Position position = getPosition();
        int x = position.getX();
        if (getOrientation() == Orientation.E) {
            x += 1;
        } else if (getOrientation() == Orientation.W) {
            x += -1;
        }
        position.setX(x);
        int y = position.getY();
        if (getOrientation() == Orientation.N) {
            y += 1;
        } else if (getOrientation() == Orientation.S) {
            y += -1;
        }
        position.setY(y);

        noticeLocale();
    }

    @Override
    public void turn(TurnAction ta) {
        switch (ta) {
            case CLOCKWISE:
                setOrientation(Orientation.valueOf(getOrientation().getClockwise()));
                break;
            case ANTICLOCKWISE:
                setOrientation(Orientation.valueOf(getOrientation().getAnticlockwise()));
                break;
        }

    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }

    @Override
    public void noticeLocale() throws Exception {
        getLocale().checkPosition(getPosition().getX(), getPosition().getY());
    }
}
