/*
Напишите программу, которая создает лист и заполняет его последовательно числами в порядке от 0 до 99.
Затем, не создавая новый лист, сделайте так, чтобы эти же числа располагались в обратом порядке — от 99 до 0 (не используя Collections.sort()).
 */

import java.util.LinkedList;
import java.util.List;

public class Solution11_4_6 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);   //вывод для наглядности
        for(int k = 0, j = 99; k < 50 && j >= 50; k++, j--) {
            int start = list.get(k);
            int end = list.get(j);
            list.set(j, start);
            list.set(k, end);
        }
        System.out.println(list);

    }
}
