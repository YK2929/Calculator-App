public class ValuePassing {
    public static void main(String[] args) {
        int number = 5;
        increment(number);
        decrement(number);
        System.out.println("元の値: " + number); // 元の値は変化しない
    }

    public static void increment(int num) {
        num++;
        System.out.println("メソッド内の値: " + num);
    }

    public static void decrement(int num) {
        num--;
        System.out.println("メソッド内の値: " + num);
    }
}