package EqualsAndHashCode;

public interface InterfaceExample {

    int a = 0;
    int b = 0;

    int multiplyByTwo(int a, int b);

    int multiplyByThree(int a, int b);

    default void method(){
        System.out.println("Hello World!");
    }
}
