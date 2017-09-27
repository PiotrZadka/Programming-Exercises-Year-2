import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char temp;
        float temp2;
        float cel,far;

        Scanner n = new Scanner(System.in);
        System.out.println("What would you like to convert? \nC - Celsius \nor \nF - Fahrenheit\n");
        temp = n.next().charAt(0);
        System.out.println("What temperature? ");
        temp2 = n.nextFloat();

        switch(temp){
            case 'C': far = 32 + (temp2 * 9 / 5);
                System.out.println(far+"F");
                break;
            case 'F': cel = (temp2 - 32) * 5 / 9;
                System.out.println(cel+"C");
                break;
        }

    }
}
