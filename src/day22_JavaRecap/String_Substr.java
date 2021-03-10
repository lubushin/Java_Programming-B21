package day22_JavaRecap;

import java.util.Scanner;

public class String_Substr {
    public static void main(String[] args) {

        /*
        substring(beg,ending):create substring
        from beg index till the given ending Index(excluded)
        substring(beg):
         */
        String sentence = "My name is Cybertek";

        String name1 = sentence.substring(11, sentence.length());
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Thursday is cool, it's a fun day";
        String day1 = str1.substring(0,2);
        System.out.println(day1);

        String day2 = str1.substring(0, str1.indexOf(" "));
        System.out.println(day2);
        System.out.println("======================================================");
        String s1 = "https://www.google.com";//com,edu,net,gov
        String domain = s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);

        String name = s1.substring(s1.indexOf(".")+1, s1.lastIndexOf("."));
        System.out.println(name);
        System.out.println("======================================================");
        name = name.substring(0,1).toUpperCase() + name.substring(1);//"Amazon"
        System.out.println(name);
        System.out.println("============================================");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine().toLowerCase().replace(" ", "");
        String lastName = scan.nextLine().toLowerCase().replace(" ", "");
scan.close();
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);

        String fullName = firstName+" "+lastName;

        System.out.println("Full name: " + fullName);





        }


    }

