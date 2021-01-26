package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.22;
        int weeklyHours = 48;

        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary before tax: " + salary + " USD");
        System.out.println("Total Taxl " + totalTax + " USD");
        System.out.println("Take home salary: " + salaryAfterTax + " USD");
    }
}
