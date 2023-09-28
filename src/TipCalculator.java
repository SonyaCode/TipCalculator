import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        System.out.println(tipPerPerson);

    }
}
