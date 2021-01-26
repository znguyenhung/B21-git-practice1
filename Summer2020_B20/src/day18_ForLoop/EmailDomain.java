package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {
    Scanner scan = new Scanner(System.in);
    String email = scan.next();

    public static void main(String[] args) {
        String email = "test@yahoo.com";
        //              012345678
        int index1 = email.indexOf("@");
        int index2 = email.indexOf("."); //14
        System.out.println(index1);
        System.out.println(index2);

        String domain = email.substring(index1+1, index2); //"gmail"
        System.out.println(domain);
    }
}
