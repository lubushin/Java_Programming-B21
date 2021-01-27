package A_Constructor;

public class Book {

        public static void method(){
            System.out.println("this is my method");
        }

public Book(){

           
    System.out.println("This is my constructor");
}

    public static void main(String[] args) {
        method();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
    }



}
