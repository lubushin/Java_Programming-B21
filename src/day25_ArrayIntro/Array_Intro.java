package day25_ArrayIntro;

public class Array_Intro {
    public static void main(String[] args) {
        String[] names = {"Mike","Adam","Tonny","John","Ammy", "Robert", "Maya"};
        //index num:         0      1      2       3      4
        //retrieve data from array:
        System.out.println(names[2]);
        String str1 = names[0];
        System.out.println(str1);

        int[] score = {80,85,90,70,75,92,74,};
        //index num     0  1  2  3  4  5  6
        /*System.out.println(names[2] + " : " + score[2]);
        System.out.println(names[3] + " : " + score[3]);
        System.out.println(names[4] + " : " + score[4]);*/
                    //i< 9 is same with i <=9-1
        for(int i =0; i< names.length; i++){// i: 1,2,3,4,5,6
            System.out.println(names[i] + " : " + score[i]);

        }



    }
}
