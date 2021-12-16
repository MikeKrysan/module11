package Vebinar.ToDoList;

import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    //1.создадим приложение со списком задач. Для начала реализуем добавление задачи и вывод всех задач
    //Сначала мы будем использовать простой массив
    //Чтобы начать работу, необходимо знать вместимость массива и сколько всего элементов было добавлено
    public static void main(String[] args) {
        //нам нужно будет читать пользовательский ввод, поэтому добавим Scanner
        DynamicArray todos = new DynamicArray(1);
        Scanner scanner = new Scanner(System.in);
        //Нам нужно выбрать что мы хотим делать: прочитать  то, что выбрал пользователь
        do {
            System.out.println("1.Add to do\n2.Show all\n3.Exit");//компактная форма записи
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Enter your task");
                    scanner.nextLine(); //Очистка буфера, чтобы сканер мог прочитать следующее значение
                    todos.add(scanner.nextLine()); //добавляем в todos новые сообщения

                }
                case 2 -> {
                    System.out.println(todos); //переводим хеш код в читаемую строку
                }

                default -> {
                    return;
                }

            }
        } while (true);
    }

}

/*
Заметки:

1.В HashMap:
мутабельные объекты - мы можем заменить его поле, которое ответсвенно за хешкод и все - и потерять.
имутабельлные объекты - если мы изменяем строчку, у нас создается взамен новая строка (01:40 видео вебинара)
Поэтому в HashMap нужно всегда использовать имутабельные объекты, чтобы по глупому их не потерять.

2.Set реализован на Map. Именно поэтому когда мы помещаем элемент в HashSet, он помещается в ключ  HashMap, которая внутри(смотри реализацию в HashSet, строка 97 -> private transient HashMap<E,Object> map;)


*/
