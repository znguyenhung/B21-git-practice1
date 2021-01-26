package Office_Hours.Practice_06_23_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = !true != true;
        //          false  != true ===> true
        System.out.println(r1);

        boolean r2 = !r1;
        System.out.println(r2);
        System.out.println(!!!!!false); // odd=>opposite will be True

        System.out.println(!!!!!!true); // even==> same will be true

        System.out.println("===========");
        // ||;

        boolean result1 = 9 > 10 || "Java" == "Java" || 'A' == 'a';
        //                 false || true             || false

        System.out.println(result1);

        // &&
        boolean result2 = "Java" != "Python" && "Muhta" != "Good Guy";
        //                      true         &&  false

        System.out.println(result2);
    }
}
