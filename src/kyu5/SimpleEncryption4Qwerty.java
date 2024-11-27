package kyu5;

//https://www.codewars.com/kata/57f14afa5f2f226d7d0000f4/train/java

public class SimpleEncryption4Qwerty {
    static String[] arr1 = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};

    public static void main(String[] args) {
        System.out.println(encrypt(">fdd", 134));
        System.out.println(decrypt(encrypt(">fdd", 134), 134));
    }

    public static String encrypt(String text, int key) {
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (arr1[i].equals(text.substring(j,j))){

                }

            }
        }
        return text;
    }

    public static String decrypt(String encryptedText, int key) {
        return encryptedText;
    }
}

