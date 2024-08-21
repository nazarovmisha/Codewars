package kyu7;
//https://www.codewars.com/kata/57f59da8d3978bb31f000152/train/java
public class MakeMeSlow {

    public static void makeMeSlow() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

