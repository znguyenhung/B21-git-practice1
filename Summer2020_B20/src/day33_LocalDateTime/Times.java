package day33_LocalDateTime;

import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {

       LocalTime t1= LocalTime.of(23,59,59);
        System.out.println(t1);

        LocalTime t2=LocalTime.now();
        System.out.println(t2);
    }
}
