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
        String interestasstring= Integer.toString(interestasint);
        long roundedinterest= Math.round(interestamount);
        long roundedfinalamount= Math.round(depositasdouble+interestamount);

        System.out.println("CUSTOMER DETAILS");
        System.out.println("Customer Name: " + name);
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Interest Rate: " + interest+"%");
        System.out.println("calculated Interest: " + interestamount);
    }
}
