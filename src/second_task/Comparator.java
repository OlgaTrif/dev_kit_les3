package second_task;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
 * содержать элементы одного типа по парно по индексам.
 * */

public class Comparator {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4};
        Integer[] intArray4 = {1, 2, 3, 10};

        String[] strArray1 = {"a", "b", "c"};
        String[] strArray2 = {"a", "b", "c"};
        String[] strArray3 = {"a", "b", "c", "d"};
        String[] strArray4 = {"a", "b", "d"};

        boolean res = compareArrays(intArray1, intArray2);
        System.out.println("intArray1 и intArray2 равны: " + res); // true

        res = compareArrays(intArray1, intArray3);
        System.out.println("intArray1 и intArray3 равны: " + res); // false

        res = compareArrays(intArray3, intArray4);
        System.out.println("intArray3 и intArray4 равны: " + res); // false

        res = compareArrays(strArray1, strArray2);
        System.out.println("strArray1 и strArray2 равны: " + res); // true

        res = compareArrays(strArray1, strArray3);
        System.out.println("strArray1 и strArray3 равны: " + res); // false

        res = compareArrays(strArray2, strArray4);
        System.out.println("strArray2 и strArray3 равны: " + res); // false
    }
}