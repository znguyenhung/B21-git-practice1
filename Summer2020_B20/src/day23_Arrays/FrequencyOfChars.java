package day23_Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "AAAABBBBBBBBBBBBBCCCCCDDDEEEE";  //"A2B2"
        String nonDup =""; //"BCD"

        for(int i = 0; i <= str.length()-1; i++){
            String ch = ""+ str.charAt(i); //B B C C D D

            if(nonDup.contains(ch)){
                continue;
            }else {
                nonDup += ch;
            }

        }
        //System.out.println(nonDup);

        String expectedResult ="";    //"B2C2D2"

        //str = "BBCCDD"   nonDup ="BCD" ==> "B2C2D2"
        for(int j=0; j <= nonDup.length()-1; j++){
            char ch = nonDup.charAt(j); //B, C, D every single characters from nonDup
            int count = 0; //2, 2, 2
            for(int i = 0; i <= str.length()-1; i++){ //returns the frequency of each ch from str
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            expectedResult += ""+ch + count;

        }

//        char ch1 = nonDup.charAt(0); //B
//        int count1 = 0; //1+1 =2
//        for(int i = 0; i <= str.length()-1; i++){
//            if(str.charAt(i) == ch1){
//                count1++;
//            }
//        }
//        expectedResult += ""+ch1 + count1;
//
//        char ch2 = nonDup.charAt(1); //C
//        int count2 = 0; //1+1=2
//        for(int i = 0; i <= str.length()-1; i++){
//            if(str.charAt(i) == ch2){
//                count2++;
//            }
//        }
//        expectedResult += ""+ch2 + count2;
//
//        char ch3 = nonDup.charAt(2); //C
//        int count3 = 0; //1+1=2
//        for(int i = 0; i <= str.length()-1; i++){
//            if(str.charAt(i) == ch3){
//                count3++;
//            }
//        }
//        expectedResult += ""+ch3 + count3;

        System.out.println(expectedResult);


    }


}