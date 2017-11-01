import java.util.*;

public class Main {
    public static void main(String[] args) {

        String [] flyarray = {"dragonfly","horsefly","greenfly","fruitfly","housefly"};
        //convert array to a arrayList
        List<String> flylist = Arrays.asList(flyarray);
        List<String> colourlist = new ArrayList<String>();

        colourlist.add("red");
        colourlist.add("green");
        colourlist.add("blue");
        colourlist.add("yellow");
        colourlist.add("green");

        //unsorted list
        System.out.println("Unsorted flylist =");
        printList(flylist);

        //sorting (A-Z)
        Collections.sort(flylist);
        System.out.println("\nSorted flylist");
        printList(flylist);

        //searching sorted list
        int index2 = Collections.binarySearch(flylist,"horsefly");
        System.out.println("\nhorsefly has index = "+index2);

        //unsorted list
        System.out.println("\nUnsorted colourlist =");
        printList(colourlist);

        //reversing order
        Collections.reverse(colourlist);
        System.out.println("\nReversed colourlist =");
        printList(colourlist);

        //force to sort in reverse order (Z-A)
        Collections.sort(colourlist, Collections.reverseOrder());
        System.out.println("\nReversed sorted colourlist =");
        printList(colourlist);

        //count frequency
        int freq = Collections.frequency(colourlist,"green");
        System.out.println("\ncolourlist has "+freq+" elements named green");

        //shuffle
        System.out.println("\nShuffled colourlist = ");
        Collections.shuffle(colourlist);
        printList(colourlist);

        //create new object of a class StringLengthComparator
        StringLengthComparator compare = new StringLengthComparator();

        //sort array based on string length
        Collections.sort(colourlist, compare);
        System.out.println("\ncolourlist sorted by string length = ");
        printList(colourlist);


    }

    //method to list all elements in given array
    public static void printList(List <String> aList){

        for(String s: aList){
            System.out.println(s);
        }
    }
}
