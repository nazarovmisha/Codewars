package kyu7;

//Реализуйте статический метод makeItFunny(), который принимает на вход строку и возвращает её копию,
// у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию.
// Для определения каждого n-ного элемента понадобится остаток от деления %. Подумайте, как его можно использовать.
//
//        var text = "I never look back";
// Каждый третий элемент
//        App.makeItFunny(text, 3); // "I NevEr LooK bAck"

public class MakeItFunny {
    public static void main(String[] args) {
        System.out.println(makeItFunny("hello", 2));

    }

    public static String makeItFunny(String str, int n) {
        char[] result = str.toCharArray();
        int i = 0;
        while (i < result.length - n) {
            i += n;
            result[i-1] = Character.toUpperCase(result[i-1]);
        }
        return String.valueOf(result);
    }
}
