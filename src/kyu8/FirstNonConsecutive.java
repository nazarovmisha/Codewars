package kyu8;

public class FirstNonConsecutive {
    public static void main(String[] args) {
        System.out.println(find(new int[]{6334, 6335, 6336, 6337, 6338, 6339, 6340, 6342, 6343}));
    }


    static Integer find(final int[] array) {

        for (int i = 0; i < array.length - 1; i++)
         return    (array[i] - array[i + 1] != -1) ? array[i + 1] : 0;


    }
}


