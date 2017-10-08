
public class Main {
    public static void main(String[] args) {
        // valid quadratic function 1X^2 + 2X - 3 = 0  (x1 = -3 || x2 = 1)
        //Quadratic equation: aX^2 + bX + c = 0

        PolySolve equa = new PolySolve(1,2,-3);
        PolySolve equa2 = new PolySolve(1,-3,-4);

        equa.quadRoot();  // run quadratic equation method
        equa2.quadRoot();

        System.out.println("FUNCTION 1: "+equa.display());  // Displays polynomial and roots
        System.out.println(equa.solution());
        System.out.println("FUNCTION 2: "+equa2.display());
        System.out.println(equa2.solution());
        System.out.println("Polynomial sum: "+equa.add(equa2));

    }


}

