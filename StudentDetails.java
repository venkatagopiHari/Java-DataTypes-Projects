import java.util.Scanner;
class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------student Details Project---------");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Your Grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter your Percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("Hello "+name);

        System.out.println("you are "+age+" years old");

        System.out.println("your grade is :"+grade);

        System.out.println("your percentage: "+percentage);

        scanner.close();
    
    }
}