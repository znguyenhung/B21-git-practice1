package day11_NestedIf_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) { //step1
        /*
        Task03:
        write a program that can find the number of days in a monthS
        (MUST APPLY NESTED IF)
         */
        int month = 20;//step2
        boolean validNumber = month >=1 && month <=12;

        boolean days28 = month == 2; //step5// for the months that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        String result = ""; //step3

        if(validNumber){//step4 //for 28 days or 30 days or 31 days
            if(days28) {
                result = "28 Days";
            }else if(days30){
                result = "30 Days";
            }else{
                result = "31 Days";
            }
            System.out.println(result);
        }else {//step 5 //Invalid month
            result = "Invalid";
            System.out.println(result);
        }
    }
}
