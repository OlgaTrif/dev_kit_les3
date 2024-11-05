package third_task;

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 * Работу сдать в виде ссылки на гит репозиторий.
 * */

public class Pair<T, U> {
    private T first;
    private U second;

    //constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    //getter T
    public T getFirst() {
        return first;
    }

    //getter U
    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(10, "This task is done");
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("First value of Pair 1: " + pair1.getFirst());
        System.out.println("Second value of Pair 2: " + pair2.getSecond());
    }
}