package za.ac.cput.caleb.entity;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Collection<Car> exoticCars = new ArrayList<>();
    List<Car> economyCars = new ArrayList<>();
    Set<Car> sportsCars = new HashSet<>();
    Map<String, Car> luxuryCars = new HashMap<>();

    @Test
    void newExoticCar() {
        //Testing for Collection
        Car mcLaren = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        Car lamborghini = new Car.CarBuilder().setId("2").setDesc("Lamborghini Sesto Elemento").build();
        exoticCars.add(mcLaren);
        exoticCars.add(lamborghini);
        assertNotNull(exoticCars);
        System.out.println("Exotic cars that were added: \n" + exoticCars);
    }

    @Test
    void newEconomyCar() {
        //Testing for List
        Car mini = new Car.CarBuilder().setId("3").setDesc("Mini Cooper Countryman").build();
        Car vw = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        economyCars.add(mini);
        economyCars.add(vw);
        assertNotNull(economyCars);
        System.out.println("Economy cars that were added: \n" + economyCars);
    }

    @Test
    void newSportsCar() {
        //Testing for Set
        Car bmw = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        Car mercedes = new Car.CarBuilder().setId("6").setDesc("Mercedes Benz C63 AMG").build();
        sportsCars.add(bmw);
        sportsCars.add(mercedes);
        assertNotNull(sportsCars);
        System.out.println("Sports cars that were added: \n" + sportsCars);
    }

    @Test
    void newLuxuryCar() {
        //Testing for Map
        Car rr = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        Car bentley = new Car.CarBuilder().setId("8").setDesc("Bentley Continental GT").build();
        luxuryCars.put(rr.getId(), rr);
        luxuryCars.put(bentley.getId(), bentley);
        assertNotNull(luxuryCars);
        System.out.println("Luxury cars that were added: \n" + luxuryCars);
    }
}