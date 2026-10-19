import java.util.Scanner;

public class Dentaku {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Dentaku dentaku = new Dentaku();

    System.out.println("===通貨計算機===");
    System.out.println("1：円→米ドル");
    System.out.println("2：米ドル→円");
    System.out.print("1と2どちらの変換をしますか？：");

    int choice = scanner.nextInt();
    
    //日本円から米ドルの場合//
    if ( choice == 1) {
        System.out.print("変換したい日本円を入力してください：");
        double yenAmount = scanner.nextDouble();

        double dollarResult = dentaku.convertYenToDollar(yenAmount);
        System.out.println( yenAmount + "円は約" + dollarResult + "ドルです。");

    //米ドルから日本円の場合//
    } else if (choice == 2 ) {
        System.out.print("変換したい米ドルを入力してください：");
        double dollarAmount = scanner.nextDouble();

        double yenResult = dentaku.convertDollarToYen(dollarAmount);
        System.out.println( dollarAmount + "ドルは約" + yenResult + "円です。");

    } else {
        System.out.println("エラー：無効な選択です。");
    }

    scanner.close();


    
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