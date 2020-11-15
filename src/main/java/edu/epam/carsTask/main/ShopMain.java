package edu.epam.carsTask.main;

import edu.epam.carsTask.entity.Car;
import edu.epam.carsTask.entity.Shop;
import edu.epam.carsTask.report.ShopReport;
import edu.epam.carsTask.service.CarInputter;
import edu.epam.carsTask.service.ShopService;
import edu.epam.carsTask.util.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopMain {

    public static void main(String[] args) {

        Shop cars = new Shop();
        CarInputter inputter = new CarInputter();
        Scanner in = new Scanner(System.in);
        int carsCount;
        System.out.println("Enter number of cars");
        carsCount = in.nextInt();
        for (int i = 0; i < carsCount; i++) {
            cars = inputter.addCar(cars);
        }
        Menu menu = new Menu();
        menu.menuControl(cars);
    }
}

