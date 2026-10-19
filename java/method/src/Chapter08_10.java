public class Chapter08_10 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2 ,3));
		System.out.println(sum(1, 2, 3, 4));
	}

	/*
	 * TODO 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：int
	 * メソッド名	：sum
	 * 引数		：int num1, int num2
	 *
	 * 引数で渡された値合計した値を戻り値として返す
	 */
	public static int sum(int num1, int num2) {
        return num1 + num2;
    }

	//TODO sumを引数3つでオーバーロードしてください。処理は同じ
	public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
	//TODO sumを引数4つでオーバーロードしてください。処理は同じ
	 public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
