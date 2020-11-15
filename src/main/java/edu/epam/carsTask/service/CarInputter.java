package edu.epam.carsTask.service;

import edu.epam.carsTask.entity.Shop;

import java.util.Scanner;

public class CarInputter {

    public Shop addCar(Shop cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id");
        int id = in.nextInt();
        System.out.println("Enter color");
        String color = in.nextLine();
        System.out.println("Enter year");
        int year = in.nextInt();
        System.out.println("Enter brand");
        String brand = in.nextLine();
        System.out.println("Enter price");
        int price = in.nextInt();
        System.out.println("Enter model");
        String model = in.nextLine();
        System.out.println("Enter registration number");
        String registrationNumber = in.nextLine();
        cars.addNewCar(id, color, brand, year, model, price, registrationNumber);
        return cars;
    }
}
