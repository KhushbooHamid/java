import java.util.Scanner;
public class exceptionHandling {
    public static void main(String []args)
    {
        int a=10;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value for divisor");
        int b=s.nextInt();
        System.out.println("result is ");
        try{
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
