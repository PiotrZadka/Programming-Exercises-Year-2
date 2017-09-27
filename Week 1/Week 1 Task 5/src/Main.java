import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double amount;
        char type;
        char S,D,C,L;

        Scanner n = new Scanner(System.in);

        System.out.println("Please enter the amount of money in your account ");
        amount = n.nextInt();
        System.out.println("Please enter account type: \nS = Saver\nD = Deposit\nC = Child\nL = Long: ");
        type = n.next().charAt(0); // first letter of string


        switch(type){
            case 'S' : amount = amount * 1.03;
                    break;
            case 'D' : amount = amount * 1.02;
                    break;
            case 'C' : amount = amount * 1.5;
                    break;
            case 'L' : amount = amount * 1.04;
        }

        System.out.println(amount);
    }
}
