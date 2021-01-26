package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //{(1)Enter=>(2)Enter} //(4)Enter //(6)Enter
        System.out.println("Enter your gender: ");
        String gender = input.next();//(1)female

        System.out.println("Enter your age: ");
        int age = input.nextInt();//(2)19

        input.nextLine();//3' Enter(1), Enter(2)

        System.out.println("Enter your country name: ");//3
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");//4
        int zipCode = input.nextInt();

        input.nextLine(); // 5' Enter

        System.out.println("Enter your full name: ");//5
        String fullName = input.nextLine();

        System.out.println("Enter your company name: ");//6
        String companyName = input.nextLine();




    }
}
