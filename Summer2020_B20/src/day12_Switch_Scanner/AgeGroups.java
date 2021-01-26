package day12_Switch_Scanner;
/*
2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

 */
public class AgeGroups {
    //step1
    public static void main(String[] args) {
        //step2
        int age = 19;
        String areGroup = "";
        //step3
        if(age > 0 && age <= 150){
      /*      if (age < 21){//step5
                areGroup = "Teenager";
            }else if (age >= 21 && age <=55){ //age >=21 && age <= 55
                areGroup = "Adult";
            }else{ //age > 55
                areGroup = "Senior";
            }

       */
            //step 6: APPLY NEST IF ==>ternary
            areGroup = (age < 21)?"Teenager" :(age >= 21 && age <=55)?"Adult" : "Senior";
        }else{//step4
            areGroup = "Invalid";
        }
        System.out.println(areGroup);//step5
    }
}
