package day09_IfStatement;

public class alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 26;

        boolean eligible = hasID && age >= 21;
        //                   true && false ==> false

        String result ="";

        if(eligible == true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligble to buy alcohol";
        }
        if(eligible == false){
            //System.out.println("You buy your milk");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

    }
}
