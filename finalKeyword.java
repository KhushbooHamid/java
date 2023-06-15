class base
{
    final void fxn()
    {
        System.out.println("hello");
    }
}
class derived extends base
{
 
        void fxn()
        {
            System.out.println("welcome");

        }
    
}
class main{
       public static void main(String []args)
    {
        base b=new base();
        b.fxn();
    }
}
