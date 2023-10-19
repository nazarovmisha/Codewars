package kyu7;

//Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра), содержит ли строка указанную букву.
// Метод принимает два параметра:
//
//        Строка
//        Буква для поиска
//        App.hasChar("Renly", 'R'); // true
//        App.hasChar("Renly", 'r'); // false
//        App.hasChar("Tommy", 'm'); // true
//        App.hasChar("Tommy", 'd'); // false

public class TheWordContainsALetter {
    public static void main(String[] args) {
        System.out.println(hasChar("Renly",'n'));

    }
    public static boolean hasChar (String str, char ch){
        char[]charArray = str.toCharArray();
        for (char c : charArray) {
            if (c == ch) {
                return true;
            }
        }
     return false;
    }
}
