package EqualsAndHashCode;

public class AbstractClassExampleImpl extends AbstractClassExample{


    {
        System.out.println("Block inside implementation class is executed");
    }

    @Override
    int multiplyByTwo(int a, int b) {
        return a*b*2;
    }

    @Override
    int multiplyByThree(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        int result = new AbstractClassExampleImpl().multiplyByTwo(2,2);
        System.out.println("result = " + result);
        int result2 = new AbstractClassExampleImpl().multiplyByTwo(2,2);
        System.out.println("result2 = " + result2);
    }

}
