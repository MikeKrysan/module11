package Solution11_7_1;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set<Product> set = new TreeSet<>();
        //set.add(new Product("СуперБренд", "Колбаса", 3435425245L, LocalDateTime.now()));
        //set.add(new Product("ЛучшийБренд", "Сыр", 434323434L, LocalDateTime.now()));
        //set.add(new Product("ХорошийБренд", "Сыр", 4343111111L, LocalDateTime.now()));

        //Set<Product> products = new TreeSet<>(new NameComparator());
        //products.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        //products.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        Set<Product> products = new TreeSet<>(new SerialNumberComparator().reversed()); //1.
        products.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        products.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));

        for (Product product : products) {
            System.out.println(product.getName());//getBrand, getName, getSerialNumbers
        }
    }
}

/*
1.Обратите внимание, что у объекта new SerialNumberComparator() был вызван дополнительно метод reversed(),
который возвращает новый компаратор, у которого инвертирована логика сортировки, в данном случае сортировка типа long
будет не в порядке возрастания чисел, как в обычном компараторе, а наоборот.
 */