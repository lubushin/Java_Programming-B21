package day45_Exceptions;


import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) throws InterruptedException {

        try {
            System.out.println(25 / 0);//Arithmetic Exception
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        } catch (ClassCastException e) {
            System.out.println("");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        System.out.println("===========================================");

        String[] names = {"Walid","Agalar","Ayjeren"};
try {
    names[10] = "Muhtar";
}catch(IllegalArgumentException e){
    System.out.println("Illegal Argument Exception");
}catch(NoSuchElementException e){
    System.out.println("No Such Element Exception");
}catch(StringIndexOutOfBoundsException e){
    System.out.println("String Index Out Of Bounds Exception");
}catch(IndexOutOfBoundsException e){
    System.out.println("Index Out Of Bounds Exception");
}catch(RuntimeException e){
    System.out.println("Runtime Exception");

}

    }
}




