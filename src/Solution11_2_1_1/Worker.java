package Solution11_2_1_1;

import java.util.Deque;
import java.util.Queue;

public class Worker {
    private Deque toDoDeque;    //у рабочего есть ссылка на очередь заданий
                                //Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди, которая работает как обычная однонаправленная очередь,
                                // либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).
    public Worker(Deque toDoDeque) {
        this.toDoDeque = toDoDeque; //Даем ссылку на очередь в конструкторе
    }

    public void takeTask() {
        Object task = toDoDeque.pollLast();//   E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null
        if(task != null) {
            System.out.println("Выполняю задачу:" + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}
