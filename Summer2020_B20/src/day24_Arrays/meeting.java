package day24_Arrays;

import java.util.Scanner;
public class meeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int n = 1; n <= 10; n++ ){
            String ch =  "2 * " + n;
            int result = n*2;
            System.out.println(ch + " = "+result);
        }
}
}
