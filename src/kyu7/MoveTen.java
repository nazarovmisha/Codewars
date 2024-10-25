package kyu7;


public class MoveTen {
    public static void main(String[] args) {
        System.out.println(moveTen("testcase"));
    }
    public static String moveTen(String s) {
        StringBuilder result= new StringBuilder();
        String[]letters = {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] word = s.split("");
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (word[i].equals(letters[j])){
                    int c = j+10;
                    if (c>= letters.length){
                        c-= letters.length;
                    }
                    result.append(letters[c]);
                }
            }
        }
        return result.toString();
    }
}