public class PolySolve {
    private double a,b,c;
    private double x,x2;

    PolySolve(){
        //blank contructor
    }

    PolySolve(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  void quadRoot() {
        double pow = Math.pow(b,2);

        x = (-b-(Math.sqrt(pow-4*a*c)))/2*a;
        x2 = (-b+(Math.sqrt(pow-4*a*c)))/2*a;
    }

    public String getX(){
        return "x = "+x;
    }

    public String getX2(){
        return "x2 = "+x2;
    }

}
