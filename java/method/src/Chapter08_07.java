public class Chapter08_07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum;
		//TODO : 引数にaとbを渡して、addメソッドを呼び出し、戻り値を変数sumに代入してください。
		sum = add(a,b);
		//TODO : sumを出力してください。
		System.out.print(sum);
	}
	public static int add(int x, int y) {
		int total = x + y;
		return total;
	}
}
