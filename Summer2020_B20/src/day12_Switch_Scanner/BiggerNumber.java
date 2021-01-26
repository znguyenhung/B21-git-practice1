package day12_Switch_Scanner;
/* 1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT
 */
public class BiggerNumber {
    //step1
    public static void main(String[] args) {
        double n1 = 25000;
        double n2 = 2000;
        double n3 = 300;
    //step2
        boolean n1IsBigger = n1 > n2 && n1 > n3;
        //                     true || false ==>true
        boolean n2IsBigger = n2 > n1 && n2 > n3;
                //n1IsBigger == false && n2 > n3;
                //n2 > n1 && n2 > n3;
        //step4
        boolean n3IsBigger = !n1IsBigger && !n2IsBigger;
        //n1IsBigger == false && n2IsBigger == false;

    //step3
 /*       String result = "";

        //step4
        if(n1IsBigger){
            result = "n1 is bigger";
        }else if(n2IsBigger){
            result = "n2 is bigger";
        }else{//if n3 is the biggest number
            result = "n3 is bigger";
        }
  */
        //step6
        String result = (n1IsBigger)?"n1 is bigger":(n2IsBigger)?"n2 is bigger":"n3 is bigger";

        //String result = (n1IsBigger)?n1+ "n1 is bigger":(n2IsBigger)?n2+ "n2 is bigger":n3+ "n3 is bigger";
        System.out.println(result); //step5
    }
}
