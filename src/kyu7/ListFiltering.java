package kyu7;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1,2,"a","b")));
    }
        public static List<Object> filterList ( final List<Object> list){
            List<Object> answer = new ArrayList<>();
            for (Object l:list)
                if (l instanceof Number){
                    answer.add(l);
            }
            return answer;
        }
    }





