package kyu8;
//https://www.codewars.com/kata/55ad04714f0b468e8200001c
public class GetCharacterFromASCIIValue {
    public static void main(String[] args) {
        System.out.println(getChar(85));
        System.out.println(getChar(65));
        System.out.println(getChar(97));
        System.out.println(getChar(48));
    }public static char getChar(int c) {
  return (char)c;
    }
}

