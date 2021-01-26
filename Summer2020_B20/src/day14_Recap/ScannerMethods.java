package day14_Recap;
import java.util.Scanner;
public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        double num = input.nextDouble();
//        boolean num = input.nextBoolean();
        System.out.println("Do you want to learn JAva?");
//        String num = input.next(); // print first word
        String num = input.nextLine(); // print whole sentence
        System.out.println("You have entered " + num);
    }
}
