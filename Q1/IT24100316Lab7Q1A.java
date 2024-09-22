import java.util.Scanner;
public class IT24100316Lab7Q1A {
    public static void main(String[] args) {
        //define variables
        int count;

        //creat array
        double mark [] = new double[4];
        int place = 0;

        //creat scanner
        Scanner num = new Scanner(System.in) ;

        System.out.println("Enter marks for four subjects :");
        //loop
        for(count =1; count <=4; count++){
            System.out.print("Enter Subject Mark"+count+" :");
             mark[place]= num.nextDouble() ;
            place = place+1 ;
        }

        //calculation
        double sum = mark[0] + mark[1] + mark[2] + mark[3] ;
        double avg = sum / (count - 1) ;
        System.out.println("Average is : "+avg);

        //grade calculation
        if (avg <= 100 && avg >=75){
            System.out.println("Overall Grade is : Distinction");
        }
        else if (avg <=74 && avg >=50) {
            System.out.println("Overall Grade is : Credit");
        }
        else {
            System.out.println("Overall Grade is : Fail");
        }

    }
}