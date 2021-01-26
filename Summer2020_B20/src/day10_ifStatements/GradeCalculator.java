package day10_ifStatements;
/*
grade:
score < 0 or score >100
90 ~ 100 ==>A
80 ~ 89 ==>B
70 ~ 79 ==>C
60 ~ 69 ==>D
otherwise ==>F
 */
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 145;
        String grade = ""; //= "": temporary

        if(score >= 90 && score <= 100){ // 90 <= score <= 100
            grade = "A";
        }else if(score >= 80 && score <= 89){ //80<= score <=89
            grade = "B";
        }else if(score >= 70 && score <= 79){ //70 <= score <= 79
            grade = "C";
        }else if(score >= 60 && score <= 69){ //60 <= score <= 69
            grade = "D";
        }else if (score >= 0 && score <= 59) { //otherwise
            grade = "F";
        }else{ //score < 0 or score >100
            grade ="Invalid Score";
        }
        System.out.println(grade + " is the grade of student");

    }
}
