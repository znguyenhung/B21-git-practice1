package day04_Variables;

public class Variables3 {
    public static void main(String[] args) {
        //school name: Cybertek School

        String schoolName = "CyberTek School";
        System.out.println(schoolName);

        System.out.println("==============");
        String employeeName = "Ayse";
        String employeeID = "B123";
        String jobTitle = "SDET";
        double salary = 120_000.50;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("Employee Name is" + employeeName);
        System.out.println("Employee ID is " + employeeID);
        System.out.println("Job Title is " +jobTitle);
        System.out.println("Salary is " + salary + "" +
                "USD");
        System.out.println(gender);
        System.out.println(isFullTime);

    }
}
