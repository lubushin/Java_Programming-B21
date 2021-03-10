package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        ScrumTeam
            Testers:  {"Dorin", "Adil", "Fatih", "Subhi"}
            Developers: {"Kastrinsi", "Mustafa", "Ruslan"}
            SM: {"Ayse"}
            PO: {"Omid"}
            BA: {"Agalar"}
         */

        String [][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},
                {"Kastrinsi", "Mustafa", "Ruslan"},
                {"Ayse"},
                {"Omid"},
                {"Agalar"}
        };

        System.out.println(Arrays.deepToString(scrumTeam));
        for(int i=0;i<=scrumTeam.length-1;i++){//i:index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i]));//print the each team in scrum team
            for(int j = 0;j<= scrumTeam[i].length-1;j++){//j:index of elements
                System.out.println(scrumTeam[i][j]);//printing each member of arrays
                System.out.println("=========================================");
               //Easy way - for each loop

                for(String[] eachGroup  : scrumTeam){//eachGroup; represent each 1D array

                    System.out.println(Arrays.toString(eachGroup));

                    for(String eachName : eachGroup)//printing each member
                    System.out.println(eachName);
                }


            }

        }
    }
}
