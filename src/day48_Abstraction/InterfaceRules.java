package day48_Abstraction;

public interface InterfaceRules {
 public int a = 100; //static by default

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);
    }
}
/*
INTERFACE:can not have Objects
I) What we can have:
1.Variables: only public and static by default
and by default final:can not reassign
2. Methods: abstract methods, static methods and default methods

II) What can not have:
1. Objects;
2. Constructor
3. Instance methods
4. Instance Variables
5. Blocks
 */