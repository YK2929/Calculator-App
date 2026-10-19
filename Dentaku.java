import java.util.Scanner;

public class Dentaku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1つ目の数値を入力
        System.out.println("1つ目の数値を入力してください");
        if (!scanner.hasNextDouble()) {
            System.out.println("不正な値が入力されました");
            return; // プログラムを終了する
        }
        double num1 = scanner.nextDouble();

        // 演算子の入力
        System.out.println("演算子（+, -, *, /）を入力してください");
        String operator = scanner.next();

        // 2つ目の数値を入力
        System.out.println("2つ目の数値を入力してください");
        if (!scanner.hasNextDouble()) {
            System.out.println("不正な値が入力されました");
            return; // プログラムを終了する
        }
        double num2 = scanner.nextDouble();

        // 4. 計算と結果の表示
        if (operator.equals("+")) {
            System.out.println("計算結果: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("計算結果: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("計算結果: " + (num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println("計算結果: " + (num1 / num2));
        } else {
            System.out.println("不正な演算子が入力されました");
        }

        scanner.close();
    }
}






/*
1.コードを貼り付ける 
2.Run java (再生ボタン)を押す 
3.1つ目の数値を入力してください と出ます 
4.ターミナル上で半角数字を入れて下さい 
5.入れたら Enter を押して下さい 
6.次に 演算子（+, -, *, /）を入力してください と出ます 
7. +, -, *, / のどれかを入れて Enter を押して下さい 
8.2つ目の数値を入力してください と出ます 
9.ターミナル上で半角数字を入れて下さい 
10.入れたら Enter を押して下さい 
11.計算結果が出てきます

電卓としての使い方は以上です また半角英字等を入れると 不正な値が入力されました と出てきます
 */
