package kyu5;
//https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
//Once upon a time, on a way through the old wild mountainous west,…
//        … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
//
//        Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
//
//        How I crossed a mountainous desert the smart way.
//        The directions given to the man are, for example, the following (depending on the language):
//
//        ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
//        or
//        { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
//        or
//        [North, South, South, East, West, North, West]
//        You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:
//
//        ["WEST"]
//        or
//        { "WEST" }
//        or
//        [West]
//        Other examples:
//        In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.
//
//        The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).
//
//        In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
//
//        Task
//        Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
//
//        The Haskell version takes a list of directions with data Direction = North | East | West | South.
//        The Clojure version returns nil when the path is reduced to nothing.
//        The Rust version takes a slice of enum Direction {North, East, West, South}.
//        See more examples in "Sample Tests:"
//        Notes
//        Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
//        if you want to translate, please ask before translating.


import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
    }

    public static String[] reduction(String[] arr) {
        String west = "WEST";
        String east = "EAST";
        String north = "NORTH";
        String south = new String("SOUTH");
        String nulll = new String("NULL");
        for (int i = 0; i < arr.length - 1; i++) {

            if (Objects.equals(arr[i], north) && Objects.equals(arr[i + 1], south)) {
                arr[i] = nulll;
                arr[i + 1] = nulll;
            } else if (Objects.equals(arr[i], south) && Objects.equals(arr[i + 1], north)) {
                arr[i] = nulll;
                arr[i + 1] = nulll;
            } else if (Objects.equals(arr[i], west) && Objects.equals(arr[i + 1], east)) {
                arr[i] = nulll;
                arr[i + 1] = nulll;
            } else if (Objects.equals(arr[i], east) && Objects.equals(arr[i + 1], west)) {
                arr[i] = nulll;
                arr[i + 1] = nulll;
            }
        }
        return arr;
    }

    public static String[] dirReduc(String[] arr) {
        reduction(arr);
        String west = new String("WEST");
        String east = new String("EAST");
        String north = new String("NORTH");
        String south = new String("SOUTH");
        String nulll = new String("NULL");
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(nulll)) ;
            tmp++;
            System.out.println(tmp);
        }


        String[] newarr = new String[tmp];
        for (int i = 0;i < arr.length; i++) {
            if (arr[i].equals(north)||arr[i].equals(south)||arr[i].equals(east)||arr[i].equals(west));
            {
                newarr[i] = arr[i];
                System.out.println(newarr[i]);
            }
        }
        System.out.println(Arrays.toString(newarr));
        return newarr;
    }
}





