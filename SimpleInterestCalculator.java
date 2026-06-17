import java.util.Scanner;
class SimpleInterestCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Simple Interest Calculator==========");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Principal Amount: ");
        double amount = sc.nextInt();

        System.out.print("Enter Rate(%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Moths: ");
        int month = sc.nextInt();

        System.out.print("Enter Days: ");
        int day = sc.nextInt();

        System.out.println("Hello "+name);

        double yearlyInterest = amount*rate/100;
        System.out.println("Yearly Interest: "+yearlyInterest);

        double monthlyInterest = yearlyInterest/12;
        System.out.println("Monthly Interest: "+monthlyInterest);

        double dailyInterest = yearlyInterest/365;
        System.out.println("Daily Interest: "+dailyInterest);

        double totalMonthlyInterest = monthlyInterest*month;
        System.out.println("Total "+month+" months of Interest: "+totalMonthlyInterest);

        double totalDaysInterest = dailyInterest*day;
        System.out.println("Total "+day+" days of Interest: "+totalDaysInterest);

        double totalInterest = totalMonthlyInterest+totalDaysInterest+yearlyInterest*year;
        System.out.println("Total "+year+" years of "+ month+" months of "+day+" days of Interest: "+totalInterest);

        double totalAmount = totalInterest+amount;
        System.out.println("Total Amount: "+totalAmount);

        sc.close();
    }
}