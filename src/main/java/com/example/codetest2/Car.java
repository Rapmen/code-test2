package com.example.codetest2;

public class Car extends Vehicle {

    public Car(String owner, Locale locale, int x, int y, Orientation orientation) {
        super(owner, locale, x, y, orientation);
    }

    @Override
    public void move() throws Exception {
        Position position = getPosition();
        int x = getOrientation() == Orientation.E ? position.getX() + 1
            : getOrientation() == Orientation.W ? position.getX() - 1 : position.getX();
        position.setX(x);
        int y = getOrientation() == Orientation.N ? position.getX() + 1
            : getOrientation() == Orientation.S ? position.getX() - 1 : position.getY();
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
