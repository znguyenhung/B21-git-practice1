package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    //second task: "can vote" or "cannot vote
    //third task: write a program that can check if two numbers

    public static void main(String[] args) {
        int age = 17;
        String citizen = "USA";
//        String result = "";
//        if(age >= 18 && citizen == "USA"){
//            result = "can vote";
//        }else {
//            result = "can not vote";
//        }
//        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "can vote" : "can not vote";
        System.out.println(result2);

        System.out.println("==========");
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal";
        //"equal" or "not equal"
        System.out.println(r);
    }
}
