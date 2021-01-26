package day11_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) { //step1
        int num = 100; //step2
        String result = ""; //step3

        if(num % 2 == 0){ //step4
            result = "Even";
        }else {
            result = "Odd";
        }
        System.out.println(result);//step5

        //ternary 1
        System.out.println("==================");
        String result2 = (num % 2 == 0) ? "Even" : "Odd"; //(condition) ?if :else
        System.out.println(result2);

        //ternary 2
        System.out.println("==================");
        int num1 = 1000;
        int num2 = 20;
        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        System.out.println(max1);

        System.out.println("=========");
        int max2 = (num1>num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("=======");
        int age = 25;
        boolean eligible = false;

        if(age >= 21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);

        //first task: convert the if statements above to ternary
        boolean eligible2 = (age >= 21) ? true : false;
        System.out.println(eligible2);

        //second task: "can vote"


    }
}
