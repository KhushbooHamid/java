public class Main
{
    public static int divide(int a , int b) throws ArithmeticException 
    {
                
       
        int result=a/b;
        return result;
       
        }

    
    public static void main(String [] args)
    {
        int c=divide(6,0);
        System.out.println(c);
    }
}
