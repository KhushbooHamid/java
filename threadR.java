class thread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("thread 1 is working");
        }
    }
}

class thread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("thread 2 is working");
        }
    }
}

class main
{
    public static void main(String []args)
    {
        
        Runnable r1=new thread1();
        Runnable r2=new thread2();
        
       Thread  t1=new Thread(r1);
        Thread t2=new Thread(r2);
        
        t1.start();
    // thread1 t1=new thread1();
    // thread2 t2= new thread2();
    
    // t1.run();
    
    }  
}
