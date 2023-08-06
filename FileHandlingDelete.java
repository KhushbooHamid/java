import java.io.File;

public class FileHandlingDelete {
    public static void main(String[] args) {
        File w=new File("first.txt");
        if(w.delete())
        {
            System.out.println("the deleted file is " +w.getName());
        }
        else{
            System.out.println("file not deleted");
        }
    }
}
