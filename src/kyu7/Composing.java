package kyu7;


//https://www.codewars.com/kata/56f253dd75e340ff670002ac/train/java

//A squared string is a string of n lines, each substring being n characters long. We are given two n-squared strings. For example:
//
//        s1 = "abcd\nefgh\nijkl\nmnop" s2 = "qrst\nuvwx\nyz12\n3456"
//
//        Let us build a new string strng of size (n + 1) x n in the following way:
//
//        The first line of strng has the first char of the first line of s1 plus the chars of the last line of s2.
//        The second line of strng has the first two chars of the second line of s1 plus the chars of the penultimate line of s2 except the last char
//        and so on until the nth line of strng has the n chars of the nth line of s1 plus the first char of the first line of s2.
//        Calling this function compose(s1, s2) we have:
//
//        compose(s1, s2) -> "a3456\nefyz1\nijkuv\nmnopq"
//        or printed:
//        abcd    qrst  -->  a3456
//        efgh    uvwx       efyz1
//        ijkl    yz12       ijkuv
//        mnop    3456       mnopq

//        abcd    qrst  -->  a3456
//        efgh    uvwx       efyz1
//        ijkl    yz12       ijkuv
//        mnop    3456       mnopq

public class Composing {
    public static void main(String[] args) {
        compose("HXxA\nTGBf\nIPhg\nuUMD", "Hcbj\nqteH\nGbMJ\ngYPW");
    }

    public static String compose(String s1, String s2) {
        int count = s1.length() / 4 + 1;
        int count2 =s1.length()/4;
        System.out.println(count);
        System.out.println(count2);

        String result = "";
        for (int i = 0; i < s1.length(); i++) {
       //  result=s1.substring(i+count)+s2.substring()
        }

        return "";
    }
}

