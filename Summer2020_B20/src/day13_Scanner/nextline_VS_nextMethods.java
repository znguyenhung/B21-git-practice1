package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();//100000

        scan.nextLine();// use this to take out the Enter

        System.out.println("Enter your full name: ");
        String fullName =  scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);


    }


}