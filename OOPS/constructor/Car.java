 class Car {
    Car() {
        System.out.println("Car()");
    }
 }
 class Bike extends Car {
    Bike() {
        super();
        System.out.println("Bike()");
    }
    public static void main(String[] args) {
        new Bike();
    }
 }

