import java.util.LinkedList;
import java.util.Queue;

public class Solution11_3_WildCard {
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        //printList(keywords); // не компилируется
    }

    private static void printList(Queue<?> keywords){
    //private static void printList(Queue<Object> keywords) {   // смотри комментарий
        for (Object o : keywords) {
            System.out.println(o);
        }
    }
}

/*
Дело в том, что Queue<String> не является наследником Queue<Object>, и поэтому не может быть аргументом метода printList. Наследниками Queue<String> могут быть ArrayDeque<String>
или LinkedList<String>.

То есть наследование работает по типам, а не по дженерикам этих типов. Поэтому тут нужен немного другой подход — с использованием понятия Wildcard, которое в Java помечается
знаком ?. Wildcard вы можете переводить как «любой тип».

 Если верхняя граница позволяет нам знать, с каким типом элементов мы работаем, то нижняя граница позволяет нам модифицировать параметризованный класс.
 */