package day12_Switch_Scanner;
/*
switch(expression){//1

			case caseValue1:
				statementsA;
				break;
			case caseValue2:
				statementsA;
				break;
			case caseValue3:
				statementsA;
				break;
			default:
				statementsC;
				break;

		}
 */
public class Switch {
    //step1
    public static void main(String[] args) {
        //step2

        int a = 1;

        switch(a){

            case 5:
                System.out.println("Five");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Invalid Case");
                break;

        }
    }
}
