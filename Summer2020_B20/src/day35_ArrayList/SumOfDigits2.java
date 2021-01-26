package day35_ArrayList;

public class SumOfDigits2 {
    public static void main(String[] args) {
        String string = "a1b2c3";
        int sum = 0;
        for(char each:string.toCharArray()){
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);

    }
}
