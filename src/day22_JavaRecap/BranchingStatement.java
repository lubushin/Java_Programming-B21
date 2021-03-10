package day22_JavaRecap;

public class BranchingStatement {
    public static void main(String[] args) {

        int a =0;
        int b = 0;

        if(b==0){
            System.err.println("Invalid Number");
            System.exit(0);//forcefully terminating program
        }
        System.out.println(a/b);
    }
}
