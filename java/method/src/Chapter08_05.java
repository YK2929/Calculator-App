public class Chapter08_05 {
	public static void main(String[] args) {
		favoriteSports("野球"); //私は野球が得意です
		favoriteSports("サッカー"); //私はサッカーが得意です
		favoriteSports("バスケ"); //私はバスケが得意です
	}
	/* TODO:以下の条件を満たすメソッドfavoriteSportsを作成してください。
	 *     ・引数を持たせる。String sports
	 *     ・引数で受け取ったsportsを使用し「私はxxxが得意です」と出力するだけの処理を記載。
	 *       xxxには引数で受け取った値を当てはめる。
	 */
	public static void favoriteSports(String sports){
		System.out.print("私は"+sports+"が得意です");
	}
}
