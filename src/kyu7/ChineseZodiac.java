package kyu7;

public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println(chineseZodiac(1965));
        System.out.println(chineseZodiac(1938));
        System.out.println(chineseZodiac(1998));

    }

    public static String chineseZodiac(int year) {
        int startYear = 1924;
        int a = 0;
        int b = 0;
        if (year > 1983) {
            year -= 60;        }

        String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
        while (startYear < year) {
            startYear++;
            a++;
            if (a > 11) {
                a = 0;}
            if (startYear%2==0)
                b++;
                if (b > 4) {
                    b = 0;
                }
            }
        return elements[b] + " " + animals[a];
    }
}
