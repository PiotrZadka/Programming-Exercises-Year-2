public class Main {
    public static void main(String[] args) {
        PolySolve equa = new PolySolve(1,-12,-28);

        equa.quadRoot();  // run quadratic equasion method

        System.out.println(equa.getX());
        System.out.println(equa.getX2());

    }


}

