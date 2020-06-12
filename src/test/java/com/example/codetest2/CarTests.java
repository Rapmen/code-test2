package com.example.codetest2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.codetest2.behavior.TurnAction;
import com.example.codetest2.locale.CarPark;
import com.example.codetest2.location.Orientation;
import com.example.codetest2.vehicle.Car;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarTests {

    @Test
    public void criteria1() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.N);
        cp.addVehicle(car);
        log.info(car.toString());
        car.turn(TurnAction.CLOCKWISE);
        log.info(car.toString());
        assertEquals(Orientation.E, car.getOrientation(), "Wrong Orientation");
    }

    @Test
    public void criteria2() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.N);
        cp.addVehicle(car);
        log.info(car.toString());
        try {
            car.move();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info(car.toString());
        assertEquals(2, car.getPosition().getY(), "Wrong Y Coordinate");
        assertEquals(1, car.getPosition().getX(), "Wrong X Coordinate");
    }

    @Test
    public void criteria3() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.E);
        cp.addVehicle(car);
        log.info(car.toString());
        try {
            car.move();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info(car.toString());
        assertEquals(1, car.getPosition().getY(), "Wrong Y Coordinate");
        assertEquals(2, car.getPosition().getX(), "Wrong X Coordinate");
    }

    @Test
    public void criteria4() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.W);
        cp.addVehicle(car);
        log.info(car.toString());
        Exception exception = assertThrows(Exception.class, () -> car.move(), "");
        log.error(exception.getMessage());
        assertEquals("The car drove out of the border", exception.getMessage(), "Wrong Checking");
        log.info(car.toString());
    }

    @Test
    public void criteria5() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.E);
        cp.addVehicle(car);
        log.info(car.toString());
        try {
            car.move();
            car.move();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        log.info(car.toString());
        assertEquals(1, car.getPosition().getY(), "Wrong Y Coordinate");
        assertEquals(3, car.getPosition().getX(), "Wrong X Coordinate");
    }
}
