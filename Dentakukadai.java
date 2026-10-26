import java.util.Scanner;

public class Dentakukadai {
    // 1円 = 0.0067ドルの定数
    public static final double YEN_TO_DOLLAR_RATE = 0.0067;

    // 日本円を米ドルにするメソッド
    public double convertYenToDollar(double yen) {
        return yen * YEN_TO_DOLLAR_RATE;
    }

    // 米ドルを日本円にするメソッド
    public double convertDollarToYen(double dollar) {
        return dollar / YEN_TO_DOLLAR_RATE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dentakukadai dentaku = new Dentakukadai();

        System.out.println("=== 多機能電卓 ===");
        System.out.println("1：四則演算を計算する");
        System.out.println("2：円とドルのコンバートをする");
        System.out.print("四則演算を計算したいですか？円ドルのコンバートをしたいですか？（1 または 2）：");

        // モード選択の入力受付
        if (!scanner.hasNextInt()) {
            System.out.println("不正な値が入力されました");
            scanner.close();
            return;
        }
        int mode = scanner.nextInt();

        // ----------------------------------------------------
        // モード1：四則演算
        // ----------------------------------------------------
        if (mode == 1) {
            System.out.println("\n--- 四則演算モード ---");

            // 1つ目の数値を入力
            System.out.println("1つ目の数値を入力してください");
            if (!scanner.hasNextDouble()) {
                System.out.println("不正な値が入力されました");
                scanner.close();
                return;
            }
            double num1 = scanner.nextDouble();

            // 演算子の入力
            System.out.println("演算子（+, -, *, /）を入力してください");
            String operator = scanner.next();

            // 2つ目の数値を入力
            System.out.println("2つ目の数値を入力してください");
            if (!scanner.hasNextDouble()) {
                System.out.println("不正な値が入力されました");
                scanner.close();
                return;
            }
            double num2 = scanner.nextDouble();

            // 計算と結果の保持
            double result = 0;
            boolean isValidOperator = true;

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("エラー：0で割ることはできません。");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
            } else {
                System.out.println("不正な演算子が入力されました");
                isValidOperator = false;
            }

            // 正しい演算子が選ばれていた場合のみ結果を表示
            if (isValidOperator) {
                System.out.printf("計算結果: %.8f\n", result);
            }

        // ----------------------------------------------------
        // モード2：通貨コンバート
        // ----------------------------------------------------
        } else if (mode == 2) {
            System.out.println("\n--- 通貨コンバートモード ---");
            System.out.println("1：円 → 米ドル");
            System.out.println("2：米ドル → 円");
            System.out.print("1と2どちらの変換をしますか？：");

            if (!scanner.hasNextInt()) {
                System.out.println("不正な値が入力されました");
                scanner.close();
                return;
            }
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("変換したい日本円を入力してください：");
                if (!scanner.hasNextDouble()) {
                    System.out.println("不正な値が入力されました");
                    scanner.close();
                    return;
                }
                double yenAmount = scanner.nextDouble();
                double dollarResult = dentaku.convertYenToDollar(yenAmount);
                System.out.println(yenAmount + "円は約" + dollarResult + "ドルです。");

            } else if (choice == 2) {
                System.out.print("変換したい米ドルを入力してください：");
                if (!scanner.hasNextDouble()) {
                    System.out.println("不正な値が入力されました");
                    scanner.close();
                    return;
                }
                double dollarAmount = scanner.nextDouble();
                double yenResult = dentaku.convertDollarToYen(dollarAmount);
                System.out.println(dollarAmount + "ドルは約" + yenResult + "円です。");

            } else {
                System.out.println("エラー：無効な選択です。");
            }

        // ----------------------------------------------------
        // 無効なモード選択
        // ----------------------------------------------------
        } else {
            System.out.println("エラー：無効な選択です。");
        }

        scanner.close();
    }
}