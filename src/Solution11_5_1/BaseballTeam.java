package Solution11_5_1;

public class BaseballTeam {
    private String city;
    private String mascot;
    private int numberOfPlayers;

    public boolean equals(Object object) {
        if (!(object instanceof BaseballTeam)) {        //1.
            return false;
        }
        BaseballTeam other = (BaseballTeam) object;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }

    public int hashCode() {
        return numberOfPlayers;
    }
    // геттеры и сеттеры

    public String getMascot() {
        return mascot;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}

/*
1.
Оператор instanceof нужен для того, чтобы проверить, был ли объект, на которую ссылается переменная X, создан на основе какого-либо класса Y.

Оператор instanceof используется для определения типа объекта во время выполнения программы.
Определив тип объекта можно реализовать корректное приведение типов в случае, когда классы образуют иерархию.
Если выполнить некорректное приведение к некоторому типу, то на этапе выполнения будет сгенерирована исключительная ситуация, что неприемлемо.


 */