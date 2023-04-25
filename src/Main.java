public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        Integer c = b == 0 ? null : calc.devide.apply(a, b);
        String message = c == null ? "Деление на ноль невозможно!" : String.valueOf(c);
        System.out.println(message);
    }
}