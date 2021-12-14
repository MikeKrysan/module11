package Solution11_5_8;

import java.util.HashSet;
import java.util.Set;

/*
Создайте класс Card (Карта) с полями «масть» типа String и «ранг» типа String.

Определите в нем методы equals() и hashCode() (подумайте, какие лучше поля включить в оба метода).

Создайте HashSet, заполните его полностью колодой карт от 6 до туза, плюс еще 3-4 повторяющиеся карты.

Убедитесь, что длина Set в итоге после добавления карт = 36.
 */
public class Main {
    public static void main(String[] args) {
        Set<Card> set = new HashSet<>();

        // черви
        set.add(new Card("6", "черви"));
        set.add(new Card("7", "черви"));
        set.add(new Card("8", "черви"));
        set.add(new Card("9", "черви"));
        set.add(new Card("10", "черви"));
        set.add(new Card("валет", "черви"));
        set.add(new Card("дама", "черви"));
        set.add(new Card("король", "черви"));
        set.add(new Card("туз", "черви"));

        // бубны
        set.add(new Card("6", "бубны"));
        set.add(new Card("7", "бубны"));
        set.add(new Card("8", "бубны"));
        set.add(new Card("9", "бубны"));
        set.add(new Card("10", "бубны"));
        set.add(new Card("валет", "бубны"));
        set.add(new Card("дама", "бубны"));
        set.add(new Card("король", "бубны"));
        set.add(new Card("туз", "бубны"));

        // крести
        set.add(new Card("6", "крести"));
        set.add(new Card("7", "крести"));
        set.add(new Card("8", "крести"));
        set.add(new Card("9", "крести"));
        set.add(new Card("10", "крести"));
        set.add(new Card("валет", "крести"));
        set.add(new Card("дама", "крести"));
        set.add(new Card("король", "крести"));
        set.add(new Card("туз", "крести"));

        // пики
        set.add(new Card("6", "пики"));
        set.add(new Card("7", "пики"));
        set.add(new Card("8", "пики"));
        set.add(new Card("9", "пики"));
        set.add(new Card("10", "пики"));
        set.add(new Card("валет", "пики"));
        set.add(new Card("дама", "пики"));
        set.add(new Card("король", "пики"));
        set.add(new Card("туз", "пики"));

        // добавим лишние карты в полную колоду
        set.add(new Card("валет", "черви"));
        set.add(new Card("валет", "крести"));
        set.add(new Card("7", "бубны"));
        set.add(new Card("туз", "пики"));

        System.out.println(set.size()); //Убедились, что хотя мы и добавили лишние 4 карты в колоду, имплиментация HashSet интерфейса Set посчитало только те карты, которые у нас были в колоде, до добавления
                                        // лишних карт, потому как особенность интерфейса Set — отсутствие дубликатов в этой коллекции
    }
}
