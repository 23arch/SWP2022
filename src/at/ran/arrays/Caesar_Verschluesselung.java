package at.ran.arrays;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
        String result = encrypt (1, "hallo");


    }

    public static String encrypt (int shift, String stringToEncrypt) {
        char [] inputData = stringToEncrypt.toCharArray();



        for (int i = 0; 1 < inputData.length; i++)

        {
            int letter = inputData[i] + shift;

            System.out.println("newLetter:" + Character.toString(letter));
        }
        return "";
    }
    }

