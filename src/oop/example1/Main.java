package oop.example1;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Mercedes";
        c1.speed = 150;
        c1.engineVolume = 2.8;
        System.out.println();
        System.out.println(c1.name + " is traveling " + c1.speed + " km/h " + " and it has " + c1.engineVolume + " liter engine");
    }
}
