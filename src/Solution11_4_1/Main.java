package Solution11_4_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Нужно убрать из списка машины марки KIA, а все машины марки TOYOTA выставить
на продажу. Изначально выставлено 1 машину на продажу - Toyota Rav 4. В салоне
представлено 3 марки авто: "TOYOTA", "KIA", "BMW"
 */
public class Main {
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camri", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X5", false);
        Car car4 = new Car(BMW, "X3", false);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(TOYOTA, "Raw 4", true);
        Car car7 = new Car(KIA, "Ceed", false);
        Car car8 = new Car(TOYOTA, "Yaris", false);
        Car car9 = new Car(BMW, "320i", false);
        Car car10 = new Car(TOYOTA, "Corolla", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

  //      for (Car car : carList) {
  //             if (car.getBrand().equals(KIA)) {
  //                  carList.remove(car);        //когда удаляется елемент в обрабатываемом списке, Java выкидывает исключение
  //              } else if (car.getBrand().equals(TOYOTA)) {
  //              car.setOnSale(true);
  //          }
  //      }

        //Правильный способ работы с удалением элемента в списке
        Iterator<Car> iterator = carList.iterator();

        while (iterator.hasNext()) {    //пока у итератора есть хоть какие-нибудь элементы
            Car car = iterator.next();  //вытаскиваем этот элемент у итератора
            if (car.getBrand().equals(KIA)) {
                iterator.remove();
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setOnSale(true);
            }
        }


        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
