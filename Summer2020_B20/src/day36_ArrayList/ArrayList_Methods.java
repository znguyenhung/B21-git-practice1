package day36_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);//5

        int a = list.indexOf(40);
        System.out.println(a);
        System.out.println(list.indexOf(60)); //60 is not exist in the list
        System.out.println(list.lastIndexOf(40));

        boolean r1 = list.contains(100);
        System.out.println(r1);



    }
}
