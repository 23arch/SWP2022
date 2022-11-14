package at.ran.basics;



public class StringHelper {

    public static void main(String[] args) {
        int result = countLetters("Hans", 'a');
        System.out.println(result);
    }
    public static boolean isPalindrome(String text){

        return false;
    }

    public static int countLetters(String text, char search){
        char[] textArray = text.toCharArray();
        int count = 0;

        for (int i = 0; i < textArray.length; i++){
            if (textArray [i] ==search){
                count++;
            }
        }
        return count;
    }


}
