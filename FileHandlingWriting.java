import java.io.FileWriter;
import java.io.IOException;


public class FileHandlingWriting {
    public static void main(String[] args) {
        try{
            FileWriter w=new FileWriter("first.txt");
            w.write("i am khush");
            w.close();
            System.out.println("written successfully");
        }catch(IOException e)
        {
            System.out.println("error");
        }
    }
}
