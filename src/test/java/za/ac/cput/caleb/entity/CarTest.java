package za.ac.cput.caleb.entity;
/*
 * @Name: Caleb Ruiters
 * @Student Number: 215169751
 * @Date: 04/05/2021
 * @Description: The purpose of this class is to demonstrate the uses of the Collection interfaces.
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CarTest {

    private static final Collection<Car> exoticCars = new HashSet<>();
    private static final List<Car> economyCars = new ArrayList<>();
    private static final Set<Car> sportsCars = new HashSet<>();
    private static final Map<String, Car> luxuryCars = new HashMap<>();

    private static final Car exoticCar1 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("McLaren P1").build();
    private static final Car exoticCar2 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Hennessy Venom GT").build();
    private static final Car economyCar1 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Mini Cooper Countryman").build();
    private static final Car economyCar2 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Volkswagen Polo").build();
    private static final Car sportsCar1 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("BMW M4").build();
    private static final Car sportsCar2 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Mercedes Benz C63 AMG").build();
    private static final Car luxuryCar1 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Rolls Royce Phantom").build();
    private static final Car luxuryCar2 = new Car.CarBuilder().setId(UUID.randomUUID().toString()).setDesc("Bentley Continental GT").build();

    @Test
    @Order(1)
    void addToCollection() {
        exoticCars.add(exoticCar1);
        exoticCars.add(exoticCar2);
        assertNotNull(exoticCars);
        assertEquals(2, exoticCars.size());
        System.out.println("Exotic cars that were added: \n" + exoticCars);
    }
    @Test
    @Order(2)
    void findInCollection() {
        String s = "";
        for(Car car: exoticCars) {
            if (car.equals(exoticCar2)) {
                assertEquals(car, exoticCar2);
                s = car.getDesc();
            }
        }
        System.out.println("The car that was found is the: "+ s);
    }
    @Test
    @Order(3)
    void removeFromCollection() {
        assertTrue(exoticCars.remove(exoticCar1));
        assertEquals(1, exoticCars.size());
        System.out.println(exoticCars);
    }

    @Test
    @Order(4)
    void addToList() {
        economyCars.add(economyCar1);
        economyCars.add(economyCar2);
        assertNotNull(economyCars);
        assertEquals(2, economyCars.size());
        System.out.println("Economy cars that were added: \n" + economyCars);
    }
    @Test
    @Order(5)
    void findInList() {
        String s = "";
        for (Car car: economyCars) {
            if (car.equals(economyCar2)) {
                assertEquals(car, economyCar2);
                s = car.getDesc();
            }
        }
        System.out.println("The car that was found is the: "+ s);
    }
    @Test
    @Order(6)
    void removeFromList() {
        assertTrue(economyCars.remove(economyCar2));
        assertEquals(1, economyCars.size());
        System.out.println(economyCars);
    }

    @Test
    @Order(7)
    void addToSet() {
        sportsCars.add(sportsCar1);
        sportsCars.add(sportsCar2);
        assertNotNull(sportsCars);
        assertEquals(2, sportsCars.size());
        System.out.println("Sports cars that were added: \n" + sportsCars);
    }
    @Test
    @Order(8)
    void findInSet() {
        String s = "";
        for (Car car: sportsCars) {
            if (car.equals(sportsCar1)) {
                assertEquals(car, sportsCar1);
                s = car.getDesc();
            }
        }
        System.out.println("The car that was found is the: "+ s);
    }
    @Test
    @Order(9)
    void removeFromSet() {
        assertTrue(sportsCars.remove(sportsCar1));
        assertEquals(1, sportsCars.size());
        System.out.println(sportsCars);
    }

    @Test
    @Order(10)
    void addToMap() {
        luxuryCars.put(luxuryCar1.getId(), luxuryCar1);
        luxuryCars.put(luxuryCar2.getId(), luxuryCar2);
        assertNotNull(luxuryCars);
        assertEquals(2, luxuryCars.size());
        System.out.println("Luxury cars that were added: \n" + luxuryCars);
    }
    @Test
    @Order(11)
    void findInMap() {
        String s = "";
        for (Car car: luxuryCars.values()) {
            if (car.equals(luxuryCar1)) {
                assertEquals(car, luxuryCar1);
                s = car.getDesc();
            }
        }
        System.out.println("The car that was found is the: "+ s);
    }
    @Test
    @Order(12)
    void removeFromMap() {
        luxuryCars.remove(luxuryCar1.getId());
        assertEquals(1, luxuryCars.size());
        System.out.println(luxuryCars);
    }
}