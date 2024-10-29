package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codewars.com/kata/6710e54f8ef071fe99eebd07/train/java
public class MagicMusicBox {
    public static void main(String[] args) {
     //   System.out.println(Arrays.toString(magicMusicBox(new String[]{"DOWN", "REPTILE", "AMIDST", "SOFA",
      //          "SOLAR", "PLANE", "SILENCE", "MARKDOWN"})));

        System.out.println(Arrays.toString(magicMusicBox(new String[]{"DOWN", "PLANE", "AMIDST", "REPTILE",
                "SOFA", "SOLAR", "SILENCE", "DOWN", "MARKDOWN"})));
    }

    public static String[] magicMusicBox(String[] words) {
        if (words.length==0){
            return new String[0];
        }
        boolean isWorking = true;
        int j = 0;
        int k = 0;
        int count = 0;
        String[] notes = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
        List<String> list = new ArrayList<>();
        while (isWorking) {
            if (j > words.length - 1) {
                j -= words.length;
            }
            if (k > notes.length - 1) {
                k -= notes.length;
            }
            if (words[j].contains(notes[k])) {
                if (!list.contains(words[j])) {
                    list.add(words[j]);
                    k++;
                    count = 0;
                }
            } else {
                count++;
            }
            j++;
            if (count > words.length) {
                isWorking = false;
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }

}

