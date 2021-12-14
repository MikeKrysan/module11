package Solution11_5_1_ScreenCast;

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
    public boolean equals(Object o) {   //5. Добавляем методы equals и hashCode, выбрав поля brand и name
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }
}
