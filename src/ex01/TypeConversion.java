package ex01;

public class TypeConversion {
    public static void main(String[] args) {

        int i;
        double f;

        f = 1 / 5; // 0.2
        System.out.println(f);

        f = (double) 1 / 5; // 0.2
        System.out.println(f);

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i); // 2


    }
    
}
