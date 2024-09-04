package kyu6;
//https://www.codewars.com/kata/59325dc15dbb44b2440000af/train/java


public class AreWeAlternate {
    public static void main(String[] args) {
        System.out.println(isAlt("ata"));
    }

    public static boolean isAlt(String word) {
        boolean isAlt = false;
        String[] arrWord ;
        arrWord = word.split("");
        if (arrWord.length == 1) {
            return true;
        }
        for (int i = 0; i < arrWord.length; i += 2) {
            for (int j = 1; j < arrWord.length; j += 2) {
                if ("aeiou".contains(arrWord[0])) {
                    if ("aeiou".contains(arrWord[i])) {
                        if ("qwrtypsdfghjklzxcvbnm".contains(arrWord[j])) {
                            isAlt = true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if ("aeiou".contains(arrWord[j])) {
                        if ("qwrtypsdfghjklzxcvbnm".contains(arrWord[i])) {
                            isAlt = true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return isAlt;
    }
}





