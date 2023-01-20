package ky8;

//A square of squares
//        You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!
//
//        However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
//
//        Task
//        Given an integral number, determine if it's a square number:
//
//        In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
//
//        The tests will always use some integral number, so don't worry about that in dynamic typed languages.
//
//        Examples
//        -1  =>  false
//        0  =>  true
//        3  =>  false
//        4  =>  true
//        25  =>  true
//        26  =>  false

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
    }

    public static boolean isSquare(int n) {
        if (n < 0) {
            n *= -3;
        }
        Double result = Math.sqrt(n);
        int resultInt = (int) Math.sqrt(n);
        System.out.println(result);
        System.out.println(resultInt);

        return (result > resultInt || result < resultInt);
    }
}