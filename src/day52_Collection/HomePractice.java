package day52_Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import library.StringUtility;

import java.util.*;

public class HomePractice {
    public static void main(String[] args) {

        String str = "AABBBGGGHHHTTK";
        String result = "";


        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int f = Collections.frequency(Arrays.asList(str.split("")),each);
            result+=each+f;
        }
        System.out.println(result);

        }

        }




        //for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {//a,b,c
           // int f =  Collections.frequency(Arrays.asList(str.split("")),each);
            //return frequency of string

           // result +=each + f;
       // }
        //System.out.println(result);






