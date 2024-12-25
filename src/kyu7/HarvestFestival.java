package kyu7;

public class HarvestFestival {
    public static void main(String[] args) {
        System.out.println(plant('@', 3, 3, 25));
        System.out.println(plant('@', 3, 3, 35));
        System.out.println(plant('$', 4, 2, 30));
        System.out.println(plant('+', 1, 3, 15));
        System.out.println(plant('+', 1, 3, 25));
        System.out.println(plant('#', 10, 2, 15));
        System.out.println(plant(']', 46, 18, 12));
    }

    public static String plant(char seed, int water, int fert, int temp) {
        String answer = "";
        String result = "";
        if (temp >= 20 && temp <= 30) {
            for (int i = 0; i < water; i++) {
                answer += "-";
            }
            for (int i = 0; i < fert; i++) {
                answer += seed;

            }
            for (int i = 0; i < water; i++) {
                result += answer;
            }
        } else {
            if (water == 1) {
                for (int i = 0; i < (water); i++) {
                    result += "-";
                }
            } else for (int i = 0; i < (water * fert); i++) {
                result += "-";
            }
            result = result + seed;

        }
        return result;

    }

}

