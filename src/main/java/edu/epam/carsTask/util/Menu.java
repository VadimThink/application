package edu.epam.carsTask.util;

import edu.epam.carsTask.entity.Car;
import edu.epam.carsTask.entity.Shop;
import edu.epam.carsTask.report.ShopReport;
import edu.epam.carsTask.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);
    ShopService service = new ShopService();
    ShopReport report = new ShopReport();

    public void showMenu(){
        System.out.println("What do u want to find?");
        System.out.println("MENU:\n" +
                "1.Find cars with needed brand\n" +
                "2.Find cars with needed model and age\n" +
                "3.Find cars with needed age and price\n" +
                "4.Exit");
    }

    public void menuControl(Shop cars){
        boolean menuOpen = true;
        while (menuOpen){
            showMenu();
            int choose = 0;
            choose = in.nextInt();
            switch (choose){

                case 1:{
                    menuBrandFind(cars);
                    break;
                }
                case 2:{
                    menuModelWithAgeFind(cars);
                    break;
                }
                case 3:{
                    menuAgeWithPriceFind(cars);
                    break;
                }
                case 4:{
                    menuOpen = false;
                    break;
                }
                default:
                    System.out.println("Choose 1 to 4");
            }
        }
    }

    public void menuBrandFind(Shop cars){
        System.out.println("What brand do u want to find?");
        String brand = in.next();
        ArrayList<Car> neededCars = service.findCarWithBrand(cars, brand);
        report.printNeededCars(neededCars);
    }

    public void menuModelWithAgeFind(Shop cars){
        System.out.println("What model do u need?");
        String model = in.next();
        System.out.println("What age do u need?");
        int age = in.nextInt();
        ArrayList<Car> neededCars = service.findModelWithAge(cars, model, age);
        report.printNeededCars(neededCars);
    }

    public void menuAgeWithPriceFind(Shop cars){
        System.out.println("What age do u need?");
        int age = in.nextInt();
        System.out.println("What price do u need?");
        int price = in.nextInt();
        ArrayList<Car> neededCars = service.findAgeWithPrice(cars, price, age);
        report.printNeededCars(neededCars);
    }
}
