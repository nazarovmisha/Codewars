package kyu6;
//https://www.codewars.com/kata/6646c0c08b97085ca216d346/solutions/java
import java.util.Arrays;

//Earthenware                            Waterfall
//
//        ( __0__ ) ( __1__ ) ( __2__ ) ( __3__ )
//
//        ( _11__ )                     ( __4__ )
//
//        ( _10__ )                     ( __5__ )
//
//        ( _9__ ) ( __8__ ) ( __7__ ) ( __6__ )
//
//Windowsill                             Fireplace

// Earthenware  "QUTHCRDMZ"
// Waterfall  "WEVOXING"
// Fireplace  "JFABKPLY"
// Windowsill  "SSSSSSSSS"

public class SettingPlacesForTheDead {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(setTable(new String[]{"Egdob", "Liame", "Skceg", "Yesba", "Cinid", "Sallo", "Sumac",
                "Triks", "Sipat", "Elona", "Sreod", "Deyab", "Dlaps", "Nevey", "Htron"})));
    }

    public static String[] setTable(String[] theDead) {

        int favoritePlace;
        int numberOfGhosts=theDead.length;
        if (numberOfGhosts>12)
        numberOfGhosts=12;


        String[] setting = {"_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____"};
        for (int i = 0; i < numberOfGhosts; i++) {
            char firstLetter;
            System.out.println("I " + i);
            firstLetter = theDead[i].charAt(0);
            String stringFirstLetter = String.valueOf(firstLetter);


            if (stringFirstLetter.equals("Q") || stringFirstLetter.equals("U") || stringFirstLetter.equals("T") ||
                stringFirstLetter.equals("H") || stringFirstLetter.equals("C") || stringFirstLetter.equals("R") ||
                stringFirstLetter.equals("D") || stringFirstLetter.equals("M") || stringFirstLetter.equals("Z")) {
                favoritePlace = 0;

                setting = monsterPlace(favoritePlace, setting, theDead[i]);
                System.out.println(Arrays.toString(setting));

            } else if (stringFirstLetter.equals("W") || stringFirstLetter.equals("E") || stringFirstLetter.equals("V") ||
                       stringFirstLetter.equals("O") || stringFirstLetter.equals("X") || stringFirstLetter.equals("I") ||
                       stringFirstLetter.equals("N") || stringFirstLetter.equals("G")) {
                favoritePlace = 3;
                setting = monsterPlace(favoritePlace, setting, theDead[i]);
                System.out.println(Arrays.toString(setting));
            } else if (stringFirstLetter.equals("J") || stringFirstLetter.equals("F") || stringFirstLetter.equals("A") ||
                       stringFirstLetter.equals("B") || stringFirstLetter.equals("K") || stringFirstLetter.equals("P") ||
                       stringFirstLetter.equals("L") || stringFirstLetter.equals("Y")) {
                favoritePlace = 6;
                setting = monsterPlace(favoritePlace, setting, theDead[i]);
                System.out.println(Arrays.toString(setting));
            } else if(stringFirstLetter.equals("S")){
                favoritePlace = 9;
                setting = monsterPlace(favoritePlace, setting, theDead[i]);
                System.out.println(Arrays.toString(setting));
            }
        }
        return setting;
    }

    public static String[] monsterPlace(int favoritePlace, String[] monsterPlace, String monsterName) {
        int favoritePlaceMinus = favoritePlace - 1;
        int favoritePlacePlus = favoritePlace + 1;
        boolean isNewMonster = true;
        while (isNewMonster) {

            if (favoritePlacePlus > 11) {
                favoritePlacePlus -= 12;
            }
            if (favoritePlaceMinus < 0) {
                favoritePlaceMinus += 12;
            }
            System.out.println("Plus " + favoritePlacePlus);
            System.out.println("Minus " + favoritePlaceMinus);

            if (monsterPlace[favoritePlace].equals("_____")) {
                monsterPlace[favoritePlace] = monsterName;
                isNewMonster = false;
                break;
            } else if (monsterPlace[favoritePlaceMinus].equals("_____")) {
                monsterPlace[favoritePlaceMinus] = monsterName;
                isNewMonster = false;
                break;
            } else if (monsterPlace[favoritePlacePlus].equals("_____")) {
                monsterPlace[favoritePlacePlus] = monsterName;
                isNewMonster = false;
                break;
            }

            favoritePlacePlus++;
            favoritePlaceMinus--;
        }
        return monsterPlace;
    }
}


