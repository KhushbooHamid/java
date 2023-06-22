import java.util.Scanner;

 class specificExcep extends Exception {
    public String toString()
    {
        return "error value greater than 100";
    }
    public String getMessage() {
        return "error value greater than 100";
    }
}
public class Abc {
    public static void main(String []args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        try {
            if (a > 100) {
                throw new specificExcep();
            }
        } catch(specificExcep e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        //    e.printStackTravel();
        }
    }
}
