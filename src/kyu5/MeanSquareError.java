package kyu5;

//https://www.codewars.com/kata/51edd51599a189fe7f000015

public class MeanSquareError {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(solution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}));
    }

    public static double solution(int[] arr1, int[] arr2) {
        double result = 0.0;
        for (int i = 0; i < arr1.length; i++) {
            result += Math.pow(arr2[i] - arr1[i], 2);
        }
        System.out.println(result);
        return result/ arr1.length;
    }
}

