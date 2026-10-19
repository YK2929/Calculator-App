import java.util.Scanner;
public class Dentaku2 {
    //1円=0.0067ドルの定数//
    public static final double YEN_TO_DOLLAR_RATE = 0.0067;
    //日本円を米ドルにするメソッド//
    public double convertYenToDollar(double yen){
        return yen * YEN_TO_DOLLAR_RATE;
    }
    //米ドルを日本円にするメソッド//
    public double convertDollarToYen(double dollar){
        return dollar / YEN_TO_DOLLAR_RATE;
    }
    
    //動作確認用のメインメソッド//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dentaku dentaku = new Dentaku();
        
        //日本円から米ドルのテスト(1500円の場合)//
        double yenAmount = 1500.0;
        double dollarResult = dentaku.convertYenToDollar(yenAmount);
        System.out.println(yenAmount + "円は約" + dollarResult + "ドルです。");


        //米ドルから日本円のテスト(100ドルの場合)//
        double dollarAmount = 100.0;
        double yenResult = dentaku.convertDollarToYen(dollarAmount);
        System.out.println(dollarAmount + "米ドルは約" + yenResult +" 円です。");
    }
}
