# Calculator-App
# Calculator-App
# Calculator-App

public class Practice1 {
      public static void main(String[] args) {
        String[] testArray = {"りんご", "すいか", "パイナップル", "ぶどう"};
        String result = getLongestString(testArray);
        System.out.println("最も長い文字列: " + result); 
    }

    public static String getLongestString(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }

        String longest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > longest.length()) {
                longest = array[i];
            }
        }
        return longest;
    }
}
