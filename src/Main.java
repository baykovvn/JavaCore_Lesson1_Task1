public class Main {
    public static void main (String[] arg){
    Calculator calc = Calculator.instance.get();
    int a = calc.plus.apply(6,2);
    int b = calc.minus.apply(1,1);
    int c = calc.multiply.apply(-9,5);
    int d = calc.divide.apply(a,b);
    int o = calc.abs.apply(c);
    calc.println.accept(d); // печать результата деления
    calc.println.accept(o); // печать результата применения модуля
    calc.println.accept(c); // печать результата умножения

    }
}
