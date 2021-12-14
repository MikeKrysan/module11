package Solution11_2_1;

import java.util.Queue;

public class Boss {
    private Queue toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Queue toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        //boolean add(E e) - метод интерфейса Collection. Добавляет элемент в конец очереди или бросает
        // RuntimeException, если мы работаем с коллекцией фиксированной длины и выходим за размеры при добавлнении.
        System.out.println("Дал задачу " + task);
    }
}
