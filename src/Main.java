import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inicio();
    }
    public void inicio(){
        File file = new File("numberss.txt");
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextInt()){
                int value = scanner.nextInt();
                System.out.println("Valor "+value);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}