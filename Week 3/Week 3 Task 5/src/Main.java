public class Main {
    public static void main(String[] args) {
        //By inheritance
        //Line "is a" DrawingEntity
        //Circle "is a" DrawingEntity

        DrawingEntity[] arry = new DrawingEntity[4];

        arry[0] = new Line();
        arry[1] = new Circle();
        arry[2] = new Box();
        arry[3] = new DrawingEntity();

        for (int i = 0; i <arry.length; i++){
            arry[i].Display();
        }

    }
}
