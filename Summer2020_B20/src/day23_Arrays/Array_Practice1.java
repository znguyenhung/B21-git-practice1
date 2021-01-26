package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        //String students ="Muhtar", "Nadir", "Asiya";

        String[] students = {"Cybtek","Muhtar", "Nadir", "Asiya", "Saim"};
        //                      0          1        2       3       4

        String name1 = students[4];
        System.out.println(name1);

        System.out.println("=================");

        int[] scores = {85,70,95,90,100};
        //              0   1  2  3  4
        String [] names = {"Mike", "Adam", "Tohny", "John", "Amy"};
        //                  0       1       2       3      4

        //System.out.println(names[0] + " : " + scores[0]);

        for (int i = 0; i <= 4; i++){ //i: 0,1,2,3,4
            System.out.println(names[i] + " : " + scores[i]);
        }
        System.out.println("=========================");
        String[] classMates = new String[6]; // size is 5/
        classMates[0] = "Ahkjh";
        classMates[1] = "Bhkjh";
        classMates[2] = "Chkjh";
        classMates[3] = "Dhkjh";
        classMates[4] = "Ehkjh";
        classMates[5] = "Muhtar";
        //
        for (int i =0; i<= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }



    }
}
