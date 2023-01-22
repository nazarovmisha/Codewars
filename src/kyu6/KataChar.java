package kyu6;
//Find the missing letter
//        Write a method that takes an array of consecutive (increasing) letters as input and that returns
//        the missing letter in the array.
//
//        You will always get an valid array. And it will be always exactly one letter be missing.
//        The length of the array will always be at least 2.
//        The array will always contain letters in only one case.
//
//        Example:
//
//        ['a','b','c','d','f'] -> 'e'
//        ['O','Q','R','S'] -> 'P'
//        (Use the English alphabet with 26 letters!)
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have also created other katas. Take a look if you enjoyed this kata!


public class KataChar {
    public static void main(String[] args) {
        findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
    }

    public static char findMissingLetter(char[] array) {
        char result = 0;


        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int j = 0; j < alphabet.length; j++) {
            if (array[0] == alphabet[j]) {
                System.out.println(j);
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != alphabet[j + i]) {
                        result = alphabet[j + i];
                        break;
                    }
                }
            }
        }
        return result;
    }
}