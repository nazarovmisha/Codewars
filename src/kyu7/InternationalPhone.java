package kyu7;

//Реализуйте метод isInternationalPhone(), который проверяет формат указанного телефона.
// Если телефон начинается с +, значит это международный формат.
//
//        isInternationalPhone("89602223423"); // false
//        isInternationalPhone("+79602223423"); // true

public class InternationalPhone {
    public static void main(String[] args) {
        System.out.println(isInternationalPhone("79602223423"));
    }

    public static boolean isInternationalPhone(String str){
        String result = str.substring(0,1);
        return result.equals("+");
    }
}
