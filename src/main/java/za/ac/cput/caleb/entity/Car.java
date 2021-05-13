package za.ac.cput.caleb.entity;
/*
 * @Name: Caleb Ruiters
 * @Student Number: 215169751
 * @Date: 04/05/2021
 * @Description: The purpose of this class is to create a unique instance of a Car using the Builder pattern
 */
import java.util.Objects;

public class Car {
    private String id, desc;

    private Car(CarBuilder builder){
        this.id = builder.id;
        this.desc = builder.desc;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public static class CarBuilder {
        private String id, desc;

        public CarBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public CarBuilder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
