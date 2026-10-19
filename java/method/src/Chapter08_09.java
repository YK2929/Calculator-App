public class Chapter08_09 {
	public static void main(String[] args) {		
	printValue("こんにちは");
	printValue(100);
	printValue(10.1);
	printValue('A');
}

/*
 * TODO 以下の仕様でメソッドを作成してください
 *
 * 戻り値		：void
 * メソッド名	：printValue
 * 引数		：String value
 *
 * 引数はxxxですと表示するメソッド(xxxには渡された引数を当てはめる)
 */
public static void printValue(String value) {
        System.out.println("引数は" + value + "です");
    }


// TODO printValueを引数intでオーバーロードしてください。処理は同じ
public static void printValue(int value) {
        System.out.println("引数は" + value + "です");
    }
// TODO printValueを引数doubleでオーバーロードしてください。処理は同じ
public static void printValue(double value) {
        System.out.println("引数は" + value + "です");
    }
// TODO printValueを引数charでオーバーロードしてください。処理は同じ
public static void printValue(char value) {
        System.out.println("引数は" + value + "です");
    }
}
