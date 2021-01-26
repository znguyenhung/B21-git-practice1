package day07_Unary_ShortHand;

public class test {
    public static void main(String[] args) {

        System.out.println("5+2=" +3+4);
        System.out.println("5+2=" +(3+4));


        int a =3;
        int b =2;
        long c=(a+b)*2/3%2;
        System.out.println(c);

        long x = 3_000L;
        double y = (float)a;
        int z = (short)b;
        System.out.println(z%1000);

        System.out.println((int)(10.0/3));
    }
}
