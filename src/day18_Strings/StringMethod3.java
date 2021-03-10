package day18_Strings;
import java.util.Scanner;
public class StringMethod3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";
        sentence = sentence.replace("Java","Python");//new sentence
        System.out.println(sentence);

        String email = "lubushin@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println(email);

        String essay= "Batch 20 is cool, Batch 20 is the best, Batch 20 is great";
        essay = essay.replace("20", "21");
        System.out.println(essay);
        System.out.println("====================================");
        String s = "I like to learn C#, C# is cool";
        s = s.replaceFirst("C#", "Java");
        System.out.println(s);

        String t = "I like to learn Java, because Java is cool, Java is powerful";
        t = t.replaceFirst("Java is","Python is").replaceFirst("Java ", "C#");
        System.out.println(t);
        //I like to learn Java, because Python is cool, Java is powerful
        //I like to learn Java, because Python is cool, C#is powerful
        System.out.println("=================================");
        String a = "Yesterday was Monday, today is Monday, tomorrow will be Monday";
        a = a.replaceFirst("Monday","Sunday").replaceFirst("be Monday", "be Tuesday");
        System.out.println(a);

        System.out.println("========================================");
        //idexOf
        String emailAddress = "Cybertek_School@gmail.com";
        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingIndex = emailAddress.indexOf(".");
        String domain = emailAddress.substring(beginningIndex,endingIndex);
        System.out.println(domain);

        String p ="I like to watch movies and reading books";
        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1 = y.indexOf("Java ");
        System.out.println(n1);
        System.out.println("==================================");
        //lastIndexOf
        int n2 = y.lastIndexOf("J");
        System.out.println(n2);

        String name = "My name is Muhtar";
        String result = name.substring(name.lastIndexOf("M"));
        System.out.println(result);





    }
}
