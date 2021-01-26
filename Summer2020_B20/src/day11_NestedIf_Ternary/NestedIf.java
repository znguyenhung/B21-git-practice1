package day11_NestedIf_Ternary;
/*
90~100 ==>A
80~89 ==>B
70~79 ==> C
60~69 ==>D
0~59 ==>F
other ==> Invalid
 */
public class NestedIf {
    public static void main(String[] args) { //step1
        int score = 1100; //step2
        String result = ""; //step4

        if(score >= 0 && score <= 100){//step3 //valid score
            if(score >= 90){ //step 5...
                result = "A";
            }else if(score >= 80){
                result = "B";
            }else if(score >= 70){
                result = "C";
            }else if(score >= 60){
                result = "D";
            }else{
                result = "F";
            }
        }else { //invalid score //step 4
            result = "Invalid";
        }
        System.out.println(result); //step 6

        System.out.println("=================");
        /*
        precondition: mininum salary of 30k
            sub condition: minimum 2 years of job history
           1. monday
           2. tuesday
           3. wednesday
           ...
           7. sunday
           invalid ==> there is no such a day


         */
    }
}
