package day07_Unary_ShortHand;

public class Quiz {
    public static void main(String[] args) {
        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        //iNum = fNum; //wrong int < float
        iNum = (int)fNum; //right
        dNum = fNum; //right d>f

        System.out.println("Result A" + 0 + 1);
                        //string :Result A0 + 1
                        //Result A01
        System.out.println("Result B" + (1) + (2));
                        //"Result B1" + 2
                        //"Result B12
        System.out.println("Result C" + (1+2));//Result C3


        System.out.println("5 + 2 = " + 3 + 4);
                        //"5 +2 = 3" + 4
                        //"5 +2 = 34"
        System.out.println("5 + 2 = " + (3 + 4));
                        //"5 + 2 = " + 7
                        //5 + 2 = 7



    }
}
