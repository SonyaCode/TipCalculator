import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.println("Welcome to Tip Calculator!");

        System.out.print("Total bill: ");
        double totalBill = scan.nextDouble();

        System.out.print("Tip percentage (%): ");
        int tip = scan.nextInt();
        double tipPercentage = (double) tip / 100;

        System.out.print("Number of people: ");
        int numOfPeople = scan.nextInt();

        // find how much bill is for the individual
        double individualBill = totalBill / numOfPeople;

        // how much tip each person would have to pay
        double tipPerPerson = individualBill * tipPercentage;
        // individual bill including tip
        double totalPerPerson = individualBill + tipPerPerson;
        // total tips
        double totalTips = tipPerPerson * numOfPeople;
        // total bill with tips included
        double totalBillWithTips = totalBill + totalTips;

        // converting them to money format
        String tipPerPersonFormat = formatter.format(tipPerPerson);
        String totalPerPersonFormat = formatter.format(totalPerPerson);
        String totalTipsFormat = formatter.format(totalTips);
        String totalBillWithTipsFormat = formatter.format(totalBillWithTips);

        // printing out the bill
        System.out.println();

        System.out.println("------------------------");
        System.out.println("Tip Per Person: $" + tipPerPersonFormat);
        System.out.println("Total Per Person (including tip): $" + totalPerPersonFormat);
        System.out.println("Total Tips: $" + totalTipsFormat);
        System.out.println("Total Bill: $" + totalBillWithTipsFormat);
        System.out.println("------------------------");

    }
}
