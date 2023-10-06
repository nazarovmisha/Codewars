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

// "bNkTB\nhTrWO\nRTFVi\nCnnIj");
public class Composing {
    public static void main(String[] args) {
        System.out.println(compose("HXxA\\nTGBf\\nIPhg\\nuUMD", "Hcbj\\nqteH\\nGbMJ\\ngYPW"));
    }

    public static String compose(String s1, String s2) {
        String result1 = s1.charAt(0) + s2.substring(s2.length() - 4);
        String result2 = s1.substring(5, 7) + s2.substring(s2.length() - 9, s2.length() - 6);
        String result3 = s1.substring(10, 13) + s2.substring(5, 7);
        String result4 = s1.substring(15, 19) + s2.charAt(0);
        String out = result1 + "\n" + result2 + "\n" + result3 + "\n" + result4;
        return out;
    }
}