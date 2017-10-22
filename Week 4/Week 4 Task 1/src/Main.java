import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person[] pArray = new Person[5];
        pArray[0] = new Person("Piotr","Zadka", 26);
        pArray[1] = new Person("Joshua","McEwen", 20);
        pArray[2] = new Person("Jack","Philips", 19);
        pArray[3] = new Person("Khuram","Sattar", 22);
        pArray[4] = new Person("Sam","Myers", 21);

        System.out.println("Normal order:");
        for(int i = 0; i< pArray.length; i++){
            System.out.println(pArray[i].getFirstName()+" "+pArray[i].getLastName()+" "+pArray[i].getAge());
        }

        //use of array class and sorting
        Arrays.sort(pArray);
        System.out.println("\nSorted order");
        for(int i = 0; i<pArray.length; i++){
            System.out.println(pArray[i].getFirstName()+" "+pArray[i].getLastName()+" "+pArray[i].getAge());
        }





    }
}
