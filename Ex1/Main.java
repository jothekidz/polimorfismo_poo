public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("soma (2 ints): " + calc.somar(10, 5));

        System.out.println("soma (3 ints): " + calc.somar(10, 5, 2));

        System.out.println("soma (2 doubles): " + calc.somar(10.5, 5.5));
    }
}