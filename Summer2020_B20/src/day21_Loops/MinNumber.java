package day21_Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999999;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();//10,20,30,40,10

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min number: "+min);
    }
}
