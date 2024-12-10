package kyu5;

//https://www.codewars.com/kata/57f14afa5f2f226d7d0000f4/train/java


public class SimpleEncryption4Qwerty {
    static String[] arr1 = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
    static String[] arr1Shift = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
    static String[] arr2 = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ""};
    static String[] arr2Shift = {"A", "S", "D", "F", "G", "H", "J", "K", "L", ""};
    static String[] arr3 = {"z", "x", "c", "v", "b", "n", "m", ",", ".", ""};
    static String[] arr3Shift = {"Z", "X", "C", "V", "B", "N", "M", "<", ">", ""};


    public static void main(String[] args) {
        System.out.println(encrypt("Iaqh qh g iyhi,", 348));
        System.out.println(encrypt("Sr pgi jlpl Jr,lqlage Zlow Piapc I.skiaa dw. l.s ibnepizi.p ugi. de.se.f l arkwper.c", 583));
        System.out.println(decrypt("Ball",134));
    }

    public static String encrypt(String text, int key) {
        StringBuilder answer = new StringBuilder();
        String kkk = String.valueOf(key);
        String[] keyString = kkk.split("");
        String[] textArr = text.split("");
        answer.append(add(textArr, keyString));
        return answer.toString();
    }

    static String add(String[] textArr, String[] keyString) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                int a;
                if (textArr[i].equals(arr1[j])) {
                    a = j - Integer.parseInt(keyString[0]);
                    if (a < 0) {
                        a += arr1.length;
                    }
                    answer.append(arr1[a]);
                    break;
                } else if (textArr[i].equals(arr1Shift[j])) {
                    a = j - Integer.parseInt(keyString[0]);
                    if (a < 0) {
                        a += arr1Shift.length;
                    }
                    answer.append(arr1Shift[a]);
                    break;
                } else if (textArr[i].equals(arr2[j])) {
                    a = j - Integer.parseInt(keyString[1]);
                    if (a < 0) {
                        a += arr2.length - 1;
                    }
                    answer.append(arr2[a]);
                    break;
                } else if (textArr[i].equals(arr2Shift[j])) {
                    a = j - Integer.parseInt(keyString[1]);
                    if (a < 0) {
                        a += arr2Shift.length - 1;
                    }
                    answer.append(arr2Shift[a]);
                    break;
                } else if (textArr[i].equals(arr3[j])) {
                    a = j - Integer.parseInt(keyString[2]);
                    if (a < 0) {
                        a += arr3.length - 1;
                    }
                    answer.append(arr3[a]);
                    break;
                } else if (textArr[i].equals(arr3Shift[j])) {
                    a = j - Integer.parseInt(keyString[2]);
                    System.out.println(a);
                    if (a < 0) {
                        a += arr3Shift.length - 1;
                    }
                    answer.append(arr3Shift[a]);
                    break;
                } else if (textArr[i].equals(" ")) {
                    answer.append(" ");
                    break;
                }
            }
        }
        return answer.toString();
    }

    public static String decrypt(String encryptedText, int key) {
        return encrypt(encryptedText, -key);
    }
}

