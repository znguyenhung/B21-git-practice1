package day11_NestedIf_Ternary;
/*precondition: mininum salary of 30k
            sub condition: minimum 2 years of job history
 */
public class NestedIf_Practice1 {
    public static void main(String[] args) { //step1
        double salary = 29999; //step2
        double jobHistory = 0.25;

        if(salary >= 30000){ //step3
            //step5
            if(jobHistory >= 30000){
                System.out.println("You are qualified");
            }else{ //jobHistory < 2
                System.out.println("You must have been on job at least 2 year");
            }
        }else{ //step4
            System.out.println("You MUSt earn at least $30K");

        }
    }
}
