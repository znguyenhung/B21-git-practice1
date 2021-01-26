package day28_Recap;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        //1
//        for (int i = 0; i <= 4; ) {
//
//            i++;
//
//            System.out.println(i + " ");
//        }


//        int z = 5;
//        for (int i = 5; i> 0; i--) {
//            z += i;
//        }
//        System.out.println(z);
//
//        char[] array = {'D', 'C', 'A', 'B'};
//        Arrays.sort(array);
//        for (char each: array) {
//            System.out.println(each + " ");
//            if (each == 'D') {
//                continue;
//            }
//        }
        int wd=0;
        String [] days= {"sun", "mon", "wed", "sat"};
        for (int i=0; i <days. length; i++) {
            switch  (days[i]) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);
    }
}