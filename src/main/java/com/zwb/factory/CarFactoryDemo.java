package com.zwb.factory;

public class CarFactoryDemo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car bmw = carFactory.getCar("BMW");
        bmw.brand();

        Car benz = carFactory.getCar("Benz");
        benz.brand();

        Car cadillac = carFactory.getCar("Cadillac");
        cadillac.brand();

        Car rollsRoyce = carFactory.getCar("RollsRoyce");
        rollsRoyce.brand();
    }
}
