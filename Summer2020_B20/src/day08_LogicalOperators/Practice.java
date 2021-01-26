package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Tom";
        String lastName = "Frank";
        int age = 19;
        String citizenShip = "Thailand";

        boolean eligibleVote = age >=18 && citizenShip == "USA";
        //                      19>=18 && "USA"  == "USA"
        //                      true && true = true

        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is eligible to vote: " + eligibleVote);
        //Tom Frank is eligible to vote: true

    }
}
