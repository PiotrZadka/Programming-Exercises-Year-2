public class PolySolve {
    private double a, b, c;
    private double x1, x2;

    PolySolve() {
        //blank contructor
    }

    PolySolve(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void quadRoot() {
        double pow = Math.pow(b, 2);

        if(a > 0 || a < 0) {

            x1 = (-b - (Math.sqrt(pow - 4 * a * c))) / 2 * a;
            x2 = (-b + (Math.sqrt(pow - 4 * a * c))) / 2 * a;
        }
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public String display(){
        String poly1;

        if(getB() > 0 && getC() > 0 ) {
            poly1 = (int) getA() + "x\u00B2"+"+" + (int) getB() + "x" + "+" + (int) getC() + "=0";
        }
        else if(getB() > 0 && getC() < 0){
            poly1 = (int) getA() + "x\u00B2"+ "+" + (int) getB() + "x" + (int) getC() + "=0";
        }
        else if(getB() < 0 && getC() < 0){
            poly1 = (int) getA() + "x\u00B2" + (int) getB() + "x" + (int) getC() + "=0";
        }
        else if(getB() < 0 && getC() > 0){
            poly1 = (int) getA() + "x\u00B2" + (int) getB() + "x" + "+" + (int) getC() + "=0";
        }
        else{
            poly1 = (int) getA() + "x\u00B2"+"+" + (int) getB() + "x" +  (int) getC() + "=0";
        }

        return poly1;
    }


    public String getX() {
        if(x1 > 0 || x1 < 0) {
            return "x1 = " + x1;
        }
        else{
            return "x2 is unsolvable or is a linear function";
        }
    }

    public String getX2() {

        if(x2 > 0 || x2 < 0) {
            return "x2 = " + x2;
        }
        else{
            return "x2 is unsolvable or is a linear function";
        }
    }

    public String solution(){
        return getX() +"\n"+getX2();
    }

    public String add(PolySolve p){  // adds both objects together
        double sumA,sumB,sumC;

        sumA = p.getA()+a;
        sumB = p.getB()+b;
        sumC = p.getC()+c;

        return (int)sumA+"+("+(int)sumB+")+("+(int)sumC+")=0";
    }

}
