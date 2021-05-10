package za.ac.cput.caleb.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Collection<Car> exoticCars;
    List<Car> economyCars;
    Set<Car> sportsCars;
    Map<String, Car> luxuryCars;
    @BeforeEach
    void setUp(){
        exoticCars = new HashSet<>();
        economyCars = new ArrayList<>();
        sportsCars = new HashSet<>();
        luxuryCars = new HashMap<>();
    }

    @Test
    void addToCollection() {
        Car exoticCar1 = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        Car exoticCar2 = new Car.CarBuilder().setId("2").setDesc("Lamborghini Sesto Elemento").build();
        exoticCars.add(exoticCar1);
        exoticCars.add(exoticCar2);
        assertNotNull(exoticCars);
        assertEquals(2, exoticCars.size());
        System.out.println("Exotic cars that were added: \n" + exoticCars);
    }
    @Test
    void findInCollection() {
        addToCollection();
        Car exoticCar1 = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        for(Car car: exoticCars) {
            if (car.equals(exoticCar1))
                assertEquals(car, exoticCar1);
        }
    }
    @Test
    void removeFromCollection() {
        addToCollection();
        Car exoticCar1 = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        assertTrue(exoticCars.remove(exoticCar1));
        assertEquals(1, exoticCars.size());
        System.out.println(exoticCars);
    }

    @Test
    void addToList() {
        Car economyCar1 = new Car.CarBuilder().setId("3").setDesc("Mini Cooper Countryman").build();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        economyCars.add(0, economyCar1);
        economyCars.add(1, economyCar2);
        assertNotNull(economyCars);
        assertEquals(2, economyCars.size());
        System.out.println("Economy cars that were added: \n" + economyCars);
    }
    @Test
    void findInList() {
        addToList();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        for (Car car: economyCars) {
            if (car.equals(economyCars))
                assertEquals(car, economyCars);
        }
    }
    @Test
    void removeFromList() {
        addToList();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        assertTrue(economyCars.remove(economyCar2));
        assertEquals(1, economyCars.size());
        System.out.println(economyCars);
    }

    @Test
    void addToSet() {
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        Car sportsCar2 = new Car.CarBuilder().setId("6").setDesc("Mercedes Benz C63 AMG").build();
        sportsCars.add(sportsCar1);
        sportsCars.add(sportsCar2);
        assertNotNull(sportsCars);
        assertEquals(2, sportsCars.size());
        System.out.println("Sports cars that were added: \n" + sportsCars);
    }
    @Test
    void findInSet() {
        addToSet();
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        for (Car car: sportsCars) {
            if (car.equals(sportsCar1))
                assertEquals(car, sportsCar1);
        }
    }
    @Test
    void removeFromSet() {
        addToSet();
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        assertTrue(sportsCars.remove(sportsCar1));
        assertEquals(1, sportsCars.size());
        System.out.println(sportsCars);
    }

    @Test
    void addToMap() {
        Car luxuryCar1 = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        Car luxuryCar2 = new Car.CarBuilder().setId("8").setDesc("Bentley Continental GT").build();
        luxuryCars.put(luxuryCar1.getId(), luxuryCar1);
        luxuryCars.put(luxuryCar2.getId(), luxuryCar2);
        assertNotNull(luxuryCars);
        assertEquals(2, luxuryCars.size());
        System.out.println("Luxury cars that were added: \n" + luxuryCars);
    }
    @Test
    void findInMap() {
        addToMap();
        Car luxuryCar1 = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        for (Car car: luxuryCars.values()) {
            if (car.equals(luxuryCar1))
                assertEquals(car, luxuryCar1);
        }
    }
    @Test
    void removeFromMap() {
        addToMap();
        Car luxuryCar1 = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        luxuryCars.remove(luxuryCar1.getId());
        assertEquals(1, luxuryCars.size());
        System.out.println(luxuryCars);
    }
}