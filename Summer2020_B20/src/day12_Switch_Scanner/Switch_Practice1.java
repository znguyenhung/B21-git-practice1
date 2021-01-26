package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        int num = 25;

        switch (num) {
            case 5:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Satarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}