public class Chapetr02_add_01 {
	public static void main(String[] args) {
		//前置インクリメント(++a)：aを1増やした後にaを使う
		//後置インクリメント(a++)：aを使った後にaを1増やす
		int ageA = 30; //Aさんの年齢
		int ageB = 50; //Bさんの年齢
		//TODO: 以下のブログラムには誤りがあります。8,9行目を修正してください。
		ageA = ++ageA; 
		ageB = --ageB;

		System.out.println("Aさんの来年の年齢は" + ageA + "歳です");
		System.out.println("Bさんの去年の年齢は" + ageB + "歳です");
	}

}
