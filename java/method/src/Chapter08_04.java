public class Chapter08_04 {
	public static void main(String[] args) {
		/*TODO 1: 引数に"カレーライス"を渡して、以下のfavoriteメソッドを呼び出して
		*      「私はカレーライスが大好物です」と出力してください。
		*/
		favorite("カレーライス");
		
		/*TODO 2: 引数に"唐揚げ"を渡して、以下のfavoriteメソッドを呼び出して
		*      「私は唐揚げが大好物です」と出力してください。
		*/
		favorite("唐揚げ");
		
		/*TODO 3: 引数に"スイーツ"を渡して、以下のfavoriteメソッドを呼び出して
		*      「私はスイーツが大好物です」と出力してください。
		*/
		favorite("スイーツ");
		

	}
	public static void favorite(String food) {
		System.out.println("私は" + food + "が大好物です");
	}
}
