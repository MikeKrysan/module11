package Solution11_6_1_HashMap;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String name;
    private boolean onSale;

    public Car(String brand, String name, boolean onSale) {
        if(brand == null || name == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public boolean isOnSale() {
        return onSale;
    }


    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", name='" + name +'\'' +
                ", onSale=" + onSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) &&
                name.equals(car.name) && onSale == car.onSale; //1. Добавляем сравнение по полю onSale
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }
}

/*
1. Утверждаем, что объекты типа автомобиль равны, если равны все три поля этого класса
 */