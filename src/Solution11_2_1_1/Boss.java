package Solution11_2_1_1;

import java.util.Deque;

public class Boss {
    private Deque toDoDeque;
    public Boss(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void giveTask(String task) {
        toDoDeque.add(task); // метод добавления не меняется
        System.out.println("Дал задачу " + task);
    }
}
