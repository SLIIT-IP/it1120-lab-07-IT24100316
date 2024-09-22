import java.util.Scanner;
public class IT24100316Lab7Q1B {
    public static void main(String[] args) {
         //creat scanner
        Scanner get = new Scanner(System.in) ;

        //creat array
        double [] mark = new double[4] ;

        //define variables
        double sum = 0 ;
        int colums;

        //loop
        for(int raws = 1; raws<=3; raws++) {
            System.out.println("Student " + raws);
            System.out.print("Enter Marks : ");


            for (colums = 0; colums <= 3; colums++) {
                mark[colums] = get.nextDouble();
                sum = sum + mark[colums];
            } //inner loop

            double avg = sum / mark.length;
            System.out.println("Average is : " + avg);

            if (avg <= 100 && avg >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (avg <= 74 && avg >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
            sum = 0;
            avg =0 ;

        } //outer loop
    }
}