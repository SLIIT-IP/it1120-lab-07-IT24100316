public class IT24100316Lab7Q2B {
    public static void main(String[] args) {

        //declare variables
        int line = 1 ;

        for(int raw =1; raw<=5; raw++){
            System.out.print(raw+" - ");


            for(int colum =1; colum<=line; colum++){
                System.out.print("* ");

            }//inner loop
            System.out.println();
            line++ ;

        } //outer loop
    }
}