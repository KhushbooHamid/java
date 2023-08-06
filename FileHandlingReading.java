
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingReading {
    public static void main(String[] args) {
        try {
            File f = new File("abc.txt");//file should already be present
            Scanner sc = new Scanner(f);
            
            while (sc.hasNextLine()) {
                String data = sc.nextLine(); // Read the next line
                System.out.println(data);
            }
            
            sc.close(); // Close the scanner after reading
        } catch (FileNotFoundException e) {
            System.out.println("File not found or error: " + e);
        }
    }
}
