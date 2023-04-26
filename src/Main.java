public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

        if (c == 0) {
            System.out.println("Деление на ноль невозможно!");
        } else {
            calc.println.accept(c);
        }
    }
}
