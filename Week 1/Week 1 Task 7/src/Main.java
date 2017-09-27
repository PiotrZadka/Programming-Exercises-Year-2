import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] bubbleArray = new int[50];
        Random rand = new Random();

        System.out.println("\nUnsorted:");
        for (int i = 0; i < 50; i++) {
            bubbleArray[i] = rand.nextInt(100) + 1;  // generate random number between 1-100
            System.out.print(bubbleArray[i] + " "); // array in line seperated by space
        }
        bubbleSort(bubbleArray);
        System.out.println("\nSorted:");
        for (int i = 0; i < 50; i++) {
            System.out.print(bubbleArray[i]+" ");
        }
    }

    // unchanged code
    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);
            }
        }
    }

    private static void swap(int[] a, int x, int y) {
        int tempStore = a[x];
        a[x] = a[y];
        a[y] = tempStore;
    }
}

