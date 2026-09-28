import java.util.Scanner;
public class microfinancebank{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter customer name:");
        String name= input.nextLine();
        System.out.println("Enter deposit amount:");
        int  deposit= input.nextInt();
        System.out.println("Enter interest rate:");
        double interest= input.nextDouble();

        double depositasdouble= (double) deposit;
        double interestamount= depositasdouble*interest/100;
        int interestasint= (int) interestamount;
    }
}
