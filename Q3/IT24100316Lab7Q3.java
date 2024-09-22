import java.util.Scanner;
public class IT24100316Lab7Q3 {
    public static void main(String[] args) {

        //creat scanner
        Scanner get = new Scanner (System.in) ;
        Scanner get2 = new Scanner (System.in) ;

        //define constant
        final double DISCOUNT = 0.05 ;

        // start of loop
        for(int raw=1; raw<=5; raw++){
            System.out.println("Customer "+raw);
            System.out.print("Enter total bill amount : ");
            double bill = get.nextDouble();

            System.out.print("Enter mode of payment (C for Cash, O for other) : ");
            char method = get2.next().charAt(0) ;

            //validation and calculation
            if(method == 'c' || method == 'C'){
                double total_Discount = (bill * DISCOUNT) ;
                double Total_bill = (bill - total_Discount) ;
                System.out.println("Discount is : "+total_Discount);
                System.out.println("Amount to be paid: "+Total_bill);
            } // end of first if

            else if(method == 'o' || method == 'O'){
                System.out.println("No discount applicable") ;
                System.out.println("Amount to be paid : "+bill);
            } //end of else if

            else{
                System.out.println("Payment Mode is Not Valid");
            } //end of else

            System.out.println();
        } //end of for loop
    }
}