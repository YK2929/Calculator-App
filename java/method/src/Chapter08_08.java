public class Chapter08_08 {
	public static void main(String[] args) {
		System.out.println("1つ目の数値を入力してください");
		int num1 = new java.util.Scanner(System.in).nextInt();

		System.out.println("2つ目の数値を入力してください");
		int num2 = new java.util.Scanner(System.in).nextInt();

		int sum = add(num1, num2);
		System.out.print(sum);

	}

	public static int add(int x, int y){
		return x + y ;
	}
	
}
