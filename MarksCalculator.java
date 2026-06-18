import java.util.Scanner;
class MarksCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== Student Marks Calculator==========");

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Student RollNo: ");
        int no = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Telugu Marks: ");
        int telugu = sc.nextInt();

        System.out.print("Enter Hindi Marks: ");
        int hindi = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter Social Marks: ");
        int social = sc.nextInt();

        int totalMarks = english+telugu+hindi+maths+science+social;

        System.out.println("Hi "+name+" Your RollNo is "+no+" And Your Total 6 Subjects Marks");

        System.out.println("Total Marks: "+totalMarks);

        double average = totalMarks/6.0;
        System.out.println("Average: "+average);

        double percentage = totalMarks/600.0*100;
        System.out.print("Percentage: "+percentage);

        sc.close();

    }
}