package Vebinar.ToDoList;

import java.util.Arrays;

public class DynamicArray {
    private final static int MAX_CAPACITY = 20;
    private int capacity;    // переменная, которая будет обозначать, сколько элементов помещается в наш массив
    private int size;// сколько на данный момент всего имеется элементов
    private String[] todos; //сам список наших дел

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        todos = new String[capacity];
    }

    public DynamicArray() {
        this(MAX_CAPACITY);
    }

    public void add(String item) {
        if (size >= capacity) {
            todos = grow();
        }
        todos[size++] = item;
    }


    private String[] grow() {
        capacity = todos.length*2;
        return Arrays.copyOf(todos, capacity);
    }
    @Override
    public String toString() {
        return "DynamicArray" + Arrays.toString(todos);
    }
}
