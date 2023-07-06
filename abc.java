public class abc{
    public static void main(String [] args)
    {
        try{
            int a=10;
            int b=0;
            int c=a/b;
        }catch(Exception e)
        {
            System.out.println(e);
            
        }finally{
            System.out.println("pgm executed");
        }
    }
