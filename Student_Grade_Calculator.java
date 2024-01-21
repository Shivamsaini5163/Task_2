import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks for all Subjects out of 100:-");
        System.out.println("Enter Marks of Physics:");
        int a=sc.nextInt();
        System.out.println("Enter Marks of Chemistry:");
        int b=sc.nextInt();
        System.out.println("Enter Marks of Maths:");
        int c=sc.nextInt();
        System.out.println("Enter Marks of Hindi:");
        int d=sc.nextInt();
        System.out.println("Enter Marks of English:");
        int e=sc.nextInt();
        int total=sum(a,b,c,d,e);
        if (total==-1){
            System.out.println("You entered Wrong Marks!!!");
        }
        else {
            double avg=(double) total/5;
            char grade=grade_calculation(avg);
            System.out.println("------Result------");
            System.out.println();
            System.out.println("Total Marks: "+total+"/500");
            System.out.println("Average Percentage: "+avg+"/100");
            System.out.println("Grade: "+grade);
        }
    }
    static int sum(int a,int b,int c,int d,int e){
        int total=-1;
        if ((0<=a&&a<=100)&&(0<=b&&b<=100)&&(0<=c&&c<=100)&&(0<=d&&d<=100)&&(0<=e&&e<=100)) {
            total = a + b + c + d + e;
        }
        return total;
    }
    static char grade_calculation(double avg){
        char grade;
        if (avg>90)
            grade='A';
        else if (avg>80)
            grade='B';
        else if (avg>70)
            grade='C';
        else if (avg>60)
            grade='D';
        else if (avg>=33)
            grade='E';
        else
            grade='F';
        return grade;
    }
}