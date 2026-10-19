public class ReferencePassing {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        modifyArray(numbers);
        System.out.println("元の配列: " + numbers[1]); // 配列の値は変化する
    }

    public static void modifyArray(int[] array) {
        array[0] = 100;
        array[1] = 200;
        System.out.println("メソッド内の配列: " + array[0]);
    }
}