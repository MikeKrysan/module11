package Solution11_2_1;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Паттерн Producer-Consumer:
оторого в подчинении один рабочий. Наш начальник приходит утром на работу и дает несколько заданий работнику,
а рабочий затем их выполняет одно за другим. Давайте представим эту абстракцию классами Java и напишем простую программу для демонстрации работы Queue.

 */
public class Main {
    public static void main(String[] args) {
        int numberOfTasks =5;   // ограничиваем нашу очередь 5 задачами
        Queue toDoQueue = new ArrayDeque(numberOfTasks);    //создаем очередь
        Boss boss = new Boss(toDoQueue);    //создаем начальника с ссылкой на очередь
        Worker worker = new Worker(toDoQueue);  // то же самое делаем с рабочим
        //В цикле начальник заполняет очередь заданиями
        for(int i = 1; i <= numberOfTasks; i++) {
            boss.giveTask("Задание " + i);
        }

        System.out.println("Начальник закончил давать задания");
        //В цикле говорим рабочему взять задание из очереди и выполнить его
        //скажем ему взять на одно задание больше, чем есть в очереди
        for(int i = 1; i <= numberOfTasks + 1; i++) {
            worker.takeTask();
        }
    }
}

/*
Как видим, рабочий брал задачи из очереди в той же самой последовательности, в какой начальник их размещал (FIFO).
 */