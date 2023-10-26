package com.zwb.factory;

public class CarFactory {

    public Car getCar(String brand) {
        if (brand == null && brand == "") {
            return null;
        }

        if (brand.equalsIgnoreCase("BMW")) {
            return new BmwCar();
        } else if (brand.equalsIgnoreCase("Benz")) {
            return new BenzCar();
        } else if (brand.equalsIgnoreCase("Cadillac")) {
            return new CadillacCar();
        } else if (brand.equalsIgnoreCase("RollsRoyce")) {
            return new RollsRoyceCar();
        }

        return null;
    }

}
