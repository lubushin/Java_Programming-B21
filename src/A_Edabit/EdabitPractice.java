package A_Edabit;

public class EdabitPractice {
    public static void main(String[] args) {
int num1 = 4;
int num2 = 5;
        System.out.println("isEqual(num1,num2) = " + isEqual(num1, num2));
    }
        public static boolean isEqual ( int num1, int num2){
            boolean isEqual;
            if (num1 == num2) isEqual = true;
            else isEqual = false;
            return isEqual;
        }
    }
