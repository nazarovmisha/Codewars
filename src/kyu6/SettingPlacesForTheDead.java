package kyu6;

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
        System.out.println(Arrays.toString(setTable(new String[]{"OArtlu"})));
    }
    public static String[] setTable(String[] theDead) {
        int start =0;
        int finish=11;
        int favoritePlace;
        int mosterPlace;
        String[] setting = {"_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____", "_____"};
        for (int i = 0; i < theDead.length; i++) {
            char firstLetter;
            firstLetter=theDead[i].charAt(0);
            String stringFirstLetter=String.valueOf(firstLetter);

            if (stringFirstLetter.equals("Q")||stringFirstLetter.equals("U")||stringFirstLetter.equals("T")||
                stringFirstLetter.equals("H")||stringFirstLetter.equals("C")||stringFirstLetter.equals("R")||
                stringFirstLetter.equals("D")||stringFirstLetter.equals("M")||stringFirstLetter.equals("Z")){
                favoritePlace=0;


            } else  if (stringFirstLetter.equals("Q")||stringFirstLetter.equals("U")||stringFirstLetter.equals("T")||
                        stringFirstLetter.equals("H")||stringFirstLetter.equals("C")||stringFirstLetter.equals("R")||
                        stringFirstLetter.equals("D")||stringFirstLetter.equals("M")||stringFirstLetter.equals("Z")){
                favoritePlace=0;
        }



        return setting;
    }


    }


