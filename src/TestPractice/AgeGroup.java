package TestPractice;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 4;
        String ageGroup = "";
        if(age>=1 && age<=2){
            ageGroup = "infant";
        }else if(age<=5){
            ageGroup="Toddler";
        }else if(age<=9){
            ageGroup="Kid";
        }
        System.out.println(ageGroup);
/* write a program that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
         */
    }
}
