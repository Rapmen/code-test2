package com.example.codetest2;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

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
    }

    @Test
    public void criteria4() {
        CarPark cp = new CarPark(4, 4, new ArrayList<>());
        Car car = new Car("Marvel", cp, 1, 1, Orientation.W);
        cp.addVehicle(car);
        log.info(car.toString());
        try {
            car.move();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
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
    }
}
