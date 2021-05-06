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
        //Adding cars to list
        exoticCars.add(exoticCar1);
        exoticCars.add(exoticCar2);
        assertNotNull(exoticCars);
        System.out.println("Exotic cars that were added: \n" + exoticCars);
    }
    @Test
    void findInCollection() {
        addToCollection();
        Car exoticCar1 = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        assertTrue(exoticCars.contains(exoticCar1));
    }
    @Test
    void removeFromCollection() {
        addToCollection();
        Car exoticCar1 = new Car.CarBuilder().setId("1").setDesc("McLaren P1").build();
        assertTrue(exoticCars.remove(exoticCar1));
        System.out.println(exoticCars);
    }

    @Test
    void addToList() {
        Car economyCar1 = new Car.CarBuilder().setId("3").setDesc("Mini Cooper Countryman").build();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        //Adding cars to list
        economyCars.add(0, economyCar1);
        economyCars.add(1, economyCar2);
        assertNotNull(economyCars);
        System.out.println("Economy cars that were added: \n" + economyCars);
    }
    @Test
    void findInList() {
        addToList();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        assertTrue(economyCars.contains(economyCar2));
    }
    @Test
    void removeFromList() {
        addToList();
        Car economyCar2 = new Car.CarBuilder().setId("4").setDesc("Volkswagen Polo").build();
        assertTrue(economyCars.remove(economyCar2));
        System.out.println(economyCars);
    }

    @Test
    void addToSet() {
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        Car sportsCar2 = new Car.CarBuilder().setId("6").setDesc("Mercedes Benz C63 AMG").build();
        //Adding cars to set
        sportsCars.add(sportsCar1);
        sportsCars.add(sportsCar2);
        assertNotNull(sportsCars);
        System.out.println("Sports cars that were added: \n" + sportsCars);
    }
    @Test
    void findInSet() {
        addToSet();
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        assertTrue(sportsCars.contains(sportsCar1));
    }
    @Test
    void removeFromSet() {
        addToSet();
        Car sportsCar1 = new Car.CarBuilder().setId("5").setDesc("BMW M4").build();
        assertTrue(sportsCars.remove(sportsCar1));
        System.out.println(sportsCars);
    }

    @Test
    void addToMap() {
        Car luxuryCar1 = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        Car luxuryCar2 = new Car.CarBuilder().setId("8").setDesc("Bentley Continental GT").build();
        //Adding cars to map
        luxuryCars.put(luxuryCar1.getId(), luxuryCar1);
        luxuryCars.put(luxuryCar2.getId(), luxuryCar2);
        assertNotNull(luxuryCars);
        System.out.println("Luxury cars that were added: \n" + luxuryCars);
    }
    @Test
    void findInMap() {
        addToMap();
        Car luxuryCar1 = new Car.CarBuilder().setId("7").setDesc("Rolls Royce Phantom").build();
        assertTrue(luxuryCars.containsValue(luxuryCar1));
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