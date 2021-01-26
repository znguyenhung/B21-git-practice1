package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character>list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('B');
        list.add('C');
        list.add('C');
        //list.addAll(Arrays.asList('A','A','B','B','C','C'));
        System.out.println(list);
        ArrayList<Character> nonDup = new ArrayList<>(); //{A}

        for(Character each:list){ //'A','A','B','B','C','C'
            if(!nonDup.contains(each)){
                nonDup.add(each);


            }

        }

    }
}
