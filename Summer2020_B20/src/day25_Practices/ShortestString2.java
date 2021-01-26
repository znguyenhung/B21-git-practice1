package day25_Practices;

public class ShortestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Dane", "Mary", "Alan"};

        int minLength = arr[0].length(); //3

        for(String each :arr){  // to find out the minimum lenght of the string in arr
            int l = each.length();  // 4  8   4  8

            if(l < minLength){
                minLength = l;
            }
        }


        for(String each : arr){  // to see how many strings' lengths in the array is matching with minLength
            if(each.length() == minLength ){
                System.out.println(each);
            }
        }


    }
}