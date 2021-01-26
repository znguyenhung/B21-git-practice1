package day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {
        String productName = "iphone";
        switch (productName){

            case "iphone":
            case "ipad":
//                System.out.println("Apple");
//                break;
            case "Galazy":
                System.out.println("Samsung");
                break;
            case "Macbook":
                System.out.println("Apple");
                break;
        }
    }
}
