import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char cur;
        double amount;
        double ex;

        Scanner n = new Scanner(System.in);
        System.out.println("What would you like to convert GBP to? \nU - US Dollars\nA - AU Dollars\nE - Euro\n");
        cur = n.next().charAt(0);
        System.out.println("How much? ");
        amount = n.nextDouble();

        switch (cur) {
            case 'U':
                ex = amount * 1.5;
                System.out.println(amount + " Pounds = " + ex + " US Dollars");
                break;
            case 'A':
                ex = amount * 1.9;
                System.out.println(amount + " Pounds = " + ex + " AU Dollars");
                break;
            case 'E':
                ex = amount * 1.4;
                System.out.println(amount + " Pounds = " + ex + " Euro");
                break;

        }
    }
}
