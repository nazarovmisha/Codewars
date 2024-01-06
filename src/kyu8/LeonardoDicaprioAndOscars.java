package kyu8;

//https://www.codewars.com/kata/56d49587df52101de70011e4/train/java
public class LeonardoDicaprioAndOscars {


    public static String leo(final int oscar) {
        String answer = "";
        if (oscar == 88)
            answer = " Leo finally won the oscar! Leo is happy.";
        else if (oscar > 88)
            answer = "Leo got one already!";
        else if (oscar == 86) answer = "Not even for Wolf of wallstreet?!";
        else if (oscar < 88 && oscar != 86) answer = "When will you give Leo an Oscar?";
        return answer;
    }
}



