package ex_01_Java_Basics;

public class IncrementDecrementOperator2 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;
        //11+22+11+22+13+24=103

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}
