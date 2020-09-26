import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {    // переписанный оператор деления
        int result;
        try {
            result = x / y;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!!!");
        }
        return 0;
    };
    //BinaryOperator<Integer> divide = (x, y) -> x / y; // В таком виде здесь возникает ошибка при делении на 0
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
