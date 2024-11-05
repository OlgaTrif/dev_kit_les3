package first_task;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми
 * должна быть произведена операция. Методы должны возвращать результат своей работы.
 * */

public class Calculator {

    private static final String TYPE_EXCEPTION = "Unsupported data type";

    // сложение
    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException(TYPE_EXCEPTION);
        }
    }

    // умножение
    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException(TYPE_EXCEPTION);
        }
    }

    // деление
    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Double.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException(TYPE_EXCEPTION);
        }
    }

    // вычитание
    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException(TYPE_EXCEPTION);
        }
    }

    public static void main(String[] args) {
        int intSumResult = Calculator.sum(10, 15);
        System.out.println("Сумма: " + intSumResult);

        double doubleDivideResult = Calculator.divide(10.0, 2.5);
        System.out.println("Деление: " + doubleDivideResult);

        int intSubtractResult = Calculator.subtract(10, 5);
        System.out.println("Вычитание: " + intSubtractResult);

        double doubleMultiplyResult = Calculator.multiply(3.576, 2.067);
        System.out.println("Произведение: " + doubleMultiplyResult);
    }
}
