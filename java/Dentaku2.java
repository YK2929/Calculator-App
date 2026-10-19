import java.util.Scanner;

public class Dentaku2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Dentaku2 dentaku2 = new Dentaku2();

    System.out.println("===通貨計算機===");
    System.out.println("1：円→米ドル");
    System.out.println("2：米ドル→円");
    System.out.print("1と2どちらの変換をしますか？：");

    int choice = scanner.nextInt();
    
    //日本円から米ドルの場合//
    if ( choice == 1) {
        System.out.print("変換したい日本円を入力してください：");
        double yenAmount = scanner.nextDouble();

        double dollarResult = dentaku2.convertYenToDollar(yenAmount);
        System.out.println( yenAmount + "円は約" + dollarResult + "ドルです。");

    //米ドルから日本円の場合//
    } else if (choice == 2 ) {
        System.out.print("変換したい米ドルを入力してください：");
        double dollarAmount = scanner.nextDouble();

        double yenResult = dentaku2.convertDollarToYen(dollarAmount);
        System.out.println( dollarAmount + "ドルは約" + yenResult + "円です。");

    } else {
        System.out.println("エラー：無効な選択です。");
    }

    scanner.close();
    
    }

    


    

}