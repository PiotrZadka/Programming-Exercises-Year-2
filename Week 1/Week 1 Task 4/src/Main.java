import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2,number, sum;

        Scanner n = new Scanner(System.in);


        System.out.println("Please select a first number within 1-100 range");
        number1 = n.nextInt();
        System.out.println("Please select a second number within 1-100 range");
        number2 = n.nextInt();

        number = compareNum(number1,number2);

        if(number >= 1 && number <= 100) // range check
        {
            sum = sumNumber(number);
            System.out.println(sum);
        }
        else{
            System.out.println("Number is not within range");
        }
    }

    public static int compareNum(int number1, int number2){

        int greater = 0;

        if(number1 > number2){ //Picks higher number
            greater = number1;
        }
        else{
            greater = number2;
        }
        return greater;
    }

    public static int sumNumber(int number){
        int sum = 0;
        for(int i = 1; i <= number ; i++) {
            sum = sum + i;
        }
        return sum;
    }


}
