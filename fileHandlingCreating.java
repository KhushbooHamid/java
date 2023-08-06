import java.io.File;
import java.io.IOException;

public class fileHandlingCreating {
    public static void main(String[] args) {

        File f = new File("first.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("file created successfully");

            } else {
                System.out.println("file already exist");
            }
        } catch (IOException e) {
            System.out.println("error occurred");
        }
    }
}
