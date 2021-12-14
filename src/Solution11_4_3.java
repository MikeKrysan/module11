import java.util.LinkedList;
import java.util.List;

public class Solution11_4_3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 3; i++) {
            list.add(i);
        }

        System.out.println(list.get(list.size()));
    }
}

/*
Выбрасывает ошибку при запуске. Посмотрите, к какому индексу обращается list.get(). Ответ - к 4.
IndexOutOfBoundsException: Index: 4, Size: 4
 */