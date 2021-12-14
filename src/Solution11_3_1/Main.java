package Solution11_3_1;

public class Main {
    public static void main(String[] args) {
        Box1<Integer> integerBox = new Box1<>(15);
        Number number = integerBox.getContents(); // строка 4
        System.out.println(number.getClass().getSimpleName());  //взять класс и вернуть то, что было написано в <> при объявлении
    }
}
