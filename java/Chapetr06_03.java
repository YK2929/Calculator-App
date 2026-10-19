public class Chapetr06_03 {
    public static void main(String[] args) {
        System.out.println("整数の足し算: " + add(5, 5));
        System.out.println("小数の割り算: " + add(10.5, 2.5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a / b;
    }
}

