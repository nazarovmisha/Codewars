package kyu7;

//Сэмвелл обнаружил, что его сообщения перехватываются в замке «Близнецы» и там читаются.
// Из-за этого их атаки перестали быть внезапными. Немного подумав, он разработал программу,
// которая бы шифровала сообщения по следующему алгоритму. Она бы брала текст и переставляла в нем каждые два подряд
// идущих символа.//
//        App.encrypt(" public static String encrypt(String str) {
//        // BEGIN (write your solution here)
//
//        // END
//    }"); // "omev"
//        App.encrypt("attack"); // "taatkc"
// Если число символов нечётное
///то последний символ остается на своем месте
//        App.encrypt("go!"); // "og!"
//        Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение и возвращает зашифрованное.

public class Encrypt {
    public static void main(String[] args) {
        System.out.println(encrypt("attack"));
    }

    public static String encrypt(String str) {
        char[] charArray = str.toCharArray();
        char k;
        for (int i = 0; i < charArray.length - 1; i += 2) {
            int j = i + 1;
            k = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = k;
        }
        return String.valueOf(charArray);
    }
}
