public class IT24100316Lab7Q2C {
    public static void main(String[] args) {

        //define variable
        int line = 5;

        //loop
        for(int raw=1; raw<=5; raw++){

            for(int colum =1; colum<=line; colum++){
                System.out.print(line);
            }//inner loop

            System.out.println();
            line-- ;
        }  //outer loop
    }
}