package day53_Collection;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        // 1. create a map that can contain student name and student' score
        //            put 5 of your friends names and thier scores
        //            print out the names of the students who made less than 80
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Mohammad", 99);
        scores.put("Hoshang", 98);
        scores.put("Jawad", 82);
        scores.put("Munir", 64);
        scores.put("Akbar", 74);
        scores.put("Spu",95);
        scores.put("Simona",83);
        scores.put("Pedro",81);
        scores.replace("Mohammad",79);

        List<String> earlyBirds = new ArrayList<>();//>=80
        List<String> angryBirds = new ArrayList<>();//<=80

       // scores.keySet().forEach(p->{if(scores.get(p)>=80) earlyBirds.add(p); else angryBirds.add(p); });
for(String name : scores.keySet()){
    int score = scores.get(name);
    if(score>=80){
        earlyBirds.add(name);
    }else{
        angryBirds.add(name);
    }
}
        System.out.println("earlyBirds: "+earlyBirds);
        System.out.println("angryBirds: "+angryBirds);

        System.out.println("==========================================");
        //  2. create a map that can contains name and Date Of Birth.
        //  put 5 of your classmates' names and thier date of birth
        //  print out the names of the students who were born before 1980 January 1st

       LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
       birthDays.put("Victor", LocalDate.of(2018,2,1));
       birthDays.put("Jimmy", LocalDate.of(2010,11,3));
        birthDays.put("Rembo", LocalDate.of(1987,10,24));
        birthDays.put("Karla", LocalDate.of(1996,9,24));
        birthDays.put("Ben", LocalDate.of(1956,5,23));
        birthDays.put("Ken", LocalDate.of(1967,3,29));
        birthDays.put("Steve", LocalDate.of(1959,12,24));

        LocalDate youngest = LocalDate.of(1900,1,1);
        String nameYoungest = "";
        LocalDate oldest = LocalDate.now();
        String nameOldest = "";

        for (String name : birthDays.keySet()) {
            LocalDate DOB = birthDays.get(name);
            if(DOB.isBefore(LocalDate.of(1980,1,1))){
                System.out.println(name+ ": "+DOB);
            }
            if(DOB.isAfter(youngest)){
                youngest = DOB;
                nameYoungest = name;
            }
            if(DOB.isBefore(oldest)){
                oldest = DOB;
                nameOldest = name;
            }
        }

        System.out.println("youngest: "+nameYoungest);
        System.out.println("oldest: "+nameOldest);

        System.out.println("=======================================================");
        //    3. create a map that can contain names of counties and thier capitals
        //    use for each loop to print out all the capitals

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("United States", "Washington DC");
        countries.put("Japan", "Tokio");
        countries.put("Russia", "Moscow");
        countries.put("Espana", "Madrid");
        countries.put("Brazil", "Brasilia");
        countries.put("Germany", "Berlin");
        countries.put("Pakista", "Islamabad");

        System.out.println(countries);

        countries.values().forEach(p-> {
            System.out.println(p.toUpperCase());
        });

        /*for (String value : countries.values()) {
            System.out.println(value.toUpperCase());
        }*/
        System.out.println("====================================");

        //verify:
        boolean r1 = countries.get("Russia").equals("Moscow");
        boolean r2 = countries.containsValue("Moscow");
        System.out.println(r2);
        //capital of Germany
        System.out.println(countries.get("Germany"));

        //find which country capital is Brasilia
        for (String country : countries.keySet()) {
            String capital1 = countries.get(country);
            if(capital1.equals("Brasilia")){
                System.out.println(country);
            }
        }
        System.out.println("==============================");
        //find outwhich country is capital Washington DC
         countries.keySet().forEach(p->{if(countries.get(p).equals("Washington DC")) System.out.println(p);});

         System.out.println("====================================");

    LinkedHashMap<String, Integer> sdets = new LinkedHashMap<>();
        sdets.put("Jack", 145000);
        sdets.put("Daniel", 148000);
        sdets.put("Lyuba", 155000);
        sdets.put("Valor", 115000);

        for (String key : sdets.keySet()) {
            Integer value = sdets.get(key);
            sdets.replace(key, value+500);
        }
        System.out.println("sdets"+": "+sdets);
    
    }
}
