import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader file = null;
        BufferedReader fileInput = null;
        try {
            file = new FileReader("test.txt");
            fileInput = new BufferedReader(file);
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInput.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
