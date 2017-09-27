import java.util.Scanner;

public class Main {
    public static void main(String[] args) { int number, sum;
        Scanner sc = new Scanner(System.in);
        sum =0;
        System.out.println("Please enter a number to sum up to > "); number =sc.nextInt();
        sum = sumUp(number);
        System.out.println("sum = "+sum); }
    public static int sumUp(int num)
    {
        int total=0;
        for (int i=1; i<= num; i++) {
            total+=i; }
        return total; }
}

