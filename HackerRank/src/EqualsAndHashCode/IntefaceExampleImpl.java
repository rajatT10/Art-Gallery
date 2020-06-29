package EqualsAndHashCode;

public class IntefaceExampleImpl implements InterfaceExample{

    public static void main(String[] args) {
        IntefaceExampleImpl i = new IntefaceExampleImpl();
        int result = i.multiplyByThree(2,2);
        System.out.println("result = " + result);
        i.method();
    }

    @Override
    public int multiplyByTwo(int a, int b) {
        return a*b*2;
    }

    @Override
    public int multiplyByThree(int a, int b) {
        return a*b*3;
    }
}
