package Quiz;

public class Test2 {
    public static void main(String[] args) {
      /*  String word = "Winter is coming    ";
        word = word.trim();
        System.out.println(word.length());

        //
        String a = "123";
        String b = 5 + 4 + a;
        System.out.println(b);

        //
        String result = 3425 > (9 * 1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);

        //
        String s = "the game was tied at 2–2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);
        }
        //
//        String z = "popcorn";
//        z = z.substring(1,8);
//        if (z.equals("opcor")) {
//            System.out.println(z.length());
//        } else {
//            System.out.println(z.replace("o, ", "a"));
//        }
        //
        String a1 = "today I will go to the beach";
        boolean b1 = a1.contains("i");
        boolean c1 = a1.substring(12).startsWith("go");

        String result1 = b1 && c1 ? "go" : "don't go";
        System.out.println(result1);

        //
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }

        //
        int number = 5;
        while (number < 100) {
            number += number;
        }
        System.out.println(number);

        //
        int a2 = 0;
        do {
            a2 = a2++ + --a2 - (a2 % 3);
        } while (++a2 < 4);
        System.out.println(a2);

        //
//        String str = "The whole time it was raining. ";
//        do {
//            System.out.println(str.charAt(0));
//            str = str.substring(3);
//        }while (!str.isEmpty());

        //
        String s1 = "I will find the lost book";
        String word1 = "";
        for (int index = s.length() - 1; index <= 0; index--) {
            word += s1.charAt(index);
        }
        System.out.println(word1);



        //17 : StringIndexOutOfBoundsException
        String str = "cybertek";
        for (int i = 0; i <= str.length(); i += 2) {
            System.out.println(str.charAt(i));
        }

       */

        //18:

        String input = "today it will be 100 degrees! ";
        int n = 0;
        while (n++ < input.length()) {
            if (n == 8) {
                continue;
            } else if (n == 9) {
                break;
            }
            System.out.print(input.charAt(++n));
        }


    }
}


