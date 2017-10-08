import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random(System.currentTimeMillis());

        for (int i=0; i < 5; i++) {
            System.out.println(rand.nextInt(10)+1+ " ");
        }
        System.out.println(" ");
        for(int j = 0; j < 5 ; j++){
            System.out.println(rand2.nextDouble( )+" ");
        }

    }
}
