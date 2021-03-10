package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {
        String sentence = "Capital of Canada is Washington";
        sentence = sentence.replace("Canada", "USA");

        System.out.println(sentence);
        System.out.println("====================================================");
        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
        s = s.replaceFirst("Cybertek", "MIT");
        System.out.println(s);

        String r = "cava is cool programming language, I like to learn cava at cybertek school";
        r = r.replace("ca", "ja");
        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java", "C#");
        p = p.replaceFirst("Java", "java");
        p = p.replace("Java", "");
        System.out.println(p);
        System.out.println("=================================================");
// TRIM - remove the white spaces only
        String str = "                          ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str.length());

        String str2 = "              Cybertek     School        ";
        System.out.println(str2);
        str2 = str2.trim();
        System.out.println(str2);
        System.out.println("====================================================");
        //contains = included, equals = compare
        String s2 = "I like to learn Java";
        System.out.println("Contains c#: " + s2.toLowerCase().contains("java"));

        System.out.println(s2.equals("java"));
        System.out.println(s2.equalsIgnoreCase("java"));//false:java!=Java
        System.out.println("============================================================");
        String s3 = "Cybertek School is the best";
        System.out.println(s3.contains("cybertek"));//false
        System.out.println(s3.toLowerCase().contains("cybertek"));//true

        System.out.println(s3.equals("cybertek"));//false
        System.out.println(s3.equalsIgnoreCase("cybertek"));//false
        System.out.println("============================================");
        //isEmpty
        System.out.println("Java".isEmpty());// false
        System.out.println("".isEmpty());//true
        System.out.println("=====================================");
        //starWith, endWith
        String URL = "https://www.amazon.com";
        boolean isValid = URL.startsWith("http") && URL.endsWith(".com")
                || URL.endsWith(".edu") || URL.endsWith(".net");
        if (isValid) {
            System.out.println("URL is valid");
        } else {
            System.out.println("Invalid");

            //valid emails:gmail,hotmail,yahoo,outlook
            String email = "Java_Master@java.com";
            boolean validEmail = email.endsWith("gmail.com") || email.endsWith("hotmail.com")
                    || email.endsWith("yahoo.com") || email.endsWith("outlook.com");
            if (validEmail) {
                System.out.println("valid mail");
            } else {
                System.out.println("not valid");
            }

        }
    }



    }
