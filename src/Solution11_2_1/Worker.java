package Solution11_2_1;

import java.util.Queue;

public class Worker {
    private Queue toDoQueue;    //у рабочего есть ссылка на очередь заданий

    public Worker(Queue toDoQueue) {
        this.toDoQueue = toDoQueue; //Даем ссылку на очередь в конструкторе
    }

    public void takeTask() {
        Object task = toDoQueue.poll();//   вынимаем задание из очереди
        //E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        if(task != null) {
            System.out.println("Выполняю задачу:" + task);
        } else {
        System.out.println("Нет работы! Можно идти домой");
        }
    }
}
