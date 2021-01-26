package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    /*1. monday
           2. tuesday
           3. wednesday
           ...
           7. sunday
           invalid ==> there is no such a day
     */
    public static void main(String[] args) {//step1
        int day = 4;//step2
        boolean validNumber = day >=1 && day <=7;//step3

        String result ="";

        if(validNumber){//step4 // 1<= day <=7
            /*if(day == 7){
                result = "Sunday";
            }else if(day == 6){
                result ="Saturday";
            }else if(day == 5){
                result = "Friday";
            }else if(day == 4){
                result = "Thursday";
            }else if(day == 3){
                result ="Wednesday";
            }else if(day == 2){
                result = "Tuesday";
            }else { //day == 1
                result = "Monday";
            }
             */
            result = (day == 7) ? "Sunday" :(day == 6)? "Saturday"
                    :(day == 5)?"Friday" :(day == 4)?"Thursday"
                    :(day == 3)? "Wednesday" :(day == 2)?"Tuesday" : "Monday";
            System.out.println(result);

        }else{//step5 //invalid number
            System.out.println("Invalid number");
        }
    }
}
