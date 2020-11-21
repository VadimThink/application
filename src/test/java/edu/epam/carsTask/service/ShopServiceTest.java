package edu.epam.carsTask.service;

import edu.epam.carsTask.entity.Car;
import edu.epam.carsTask.entity.Shop;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ShopServiceTest {

    Shop cars = new Shop();
    ShopService service = new ShopService();

    @BeforeClass
    public void setUp(){
        cars.addNewCar(1000001, "green", "audi", 2002, "r8", 100, "HB2002-3");
        cars.addNewCar(1000002, "blue", "ford", 2003, "gt", 105, "EV5673-4");
    }

    @Test
    public void testFindBrand() {
        String brand = "audi";
        ArrayList<Car> actual = service.findCarWithBrand(cars, brand);
        ArrayList<Car> expected = new ArrayList<>();
        Car expectedCar = new Car(1000001, "green", "audi", 2002, "r8", 100, "HB2002-3");
        expected.add(expectedCar);
        assertEquals(actual, expected);
    }


    @Test
    public void testFindModelWithAge() {
        String model = "ford";
        int age = 2003;
        ArrayList<Car> actual = service.findModelWithAge(cars, model, age);
        ArrayList<Car> expected = new ArrayList<>();
        Car expectedCar = new Car(1000002, "blue", "ford", 2003, "gt", 105, "EV5673-4");
        expected.add(expectedCar);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindAgeWithPrice() {
        int age = 2002;
        int price = 100;
        ArrayList<Car> actual = service.findAgeWithPrice(cars, price, age);
        ArrayList<Car> expected = new ArrayList<>();
        Car expectedCar = new Car(1000001, "green", "audi", 2002, "r8", 100, "HB2002-3");
        expected.add(expectedCar);
        assertEquals(actual, expected);
    }
}