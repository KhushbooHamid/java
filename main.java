import java.io.*;

class student implements Serializable {
    private static final long serialVersionUID = 2L;
    int x;
    static int y;
    String str;
    int marks;

    public student(String str, int marks, int x, int y) {
        this.str = str;
        this.marks = marks;
        this.x = x;
        this.y = y;
    }
}

public class main {
    public static void sdetails(student s1) {
        System.out.println("name =" + s1.str);
        System.out.println("marks =" + s1.marks);
        System.out.println("x =" + s1.x);
        System.out.println("y =" + s1.y);
    }

    public static void printData(student s) {
        System.out.println("Printing student data:");
        sdetails(s);
    }

    public static void main(String[] args) {
        student s = new student("abc", 90, 2, 60);
        String fname = "try.txt";
        try {
            FileOutputStream f = new FileOutputStream(fname);
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(s);
            o.close();
            f.close();
            System.out.println("serialization done");
            printData(s);
            s.y = 40;
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream i = new ObjectInputStream(f);

            s = (student) i.readObject();
            i.close();
            f.close();
            System.out.println("deserialization done");
            printData(s);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
