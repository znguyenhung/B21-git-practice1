package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //           01234
        String result = ""; //"ab"
        for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i); //a,b,a,b

            if (!result.contains(s)){ //if the character is already contained in result, we will ...
                result += s;
            }
        }
        System.out.println(result);
    }
}
