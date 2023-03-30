/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * Driver/Main Class
 */
//Package Statement
package payrolldemo;

//Class Import Statement
import java.util.Scanner;

//Class Definition
public class PayrollDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1;
        int input2;
        double input3, input4;
        Payroll payment = new Payroll();
        System.out.print("Enter Name: ");
        input1 = scanner.nextLine();
        try {
            payment.setName(input1);
        } catch (Exception exp) {
            System.out.println(exp);
        }
        System.out.print("Enter Id Number: ");
        input2 = scanner.nextInt();
        try {
            payment.setId(input2);
        } catch (Exception exp) {
            System.out.println(exp);
        }
        System.out.print("Enter Hours Worked: ");
        input3 = scanner.nextDouble();
        try {
            payment.sethours_worked(input3);
        } catch (Exception exp) {
            System.out.println(exp);
        }
        System.out.print("Enter Hourly PayRate: ");
        input4 = scanner.nextDouble();
        try {
            payment.sethourly_payrate(input4);
        } catch (Exception exp) {
            System.out.println(exp);
        }

        if (payment.gethours_worked() > 0 && payment.gethourly_payrate() > 0) {
            System.out.println("Gross Pay is " + payment.getgrosspay());
        }
    }
}
