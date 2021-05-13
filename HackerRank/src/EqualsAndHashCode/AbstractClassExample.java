package EqualsAndHashCode;

public abstract class AbstractClassExample {

    private static final int a;

    static {
        a = 0;
        System.out.println("Static block is executed");
    }

    {
        System.out.println("Block is executed with a="+a);
    }

    int b = 0;

    abstract int multiplyByTwo(int a, int b);

    abstract int multiplyByThree(int a, int b);

    void method(){
        System.out.println("Hello World!");
    }


}
