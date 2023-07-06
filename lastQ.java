class thread1 implements Runnable{
    public void run()
    {
        while(true)
        {
            System.out.println("thread1 is implementing");
        }
    }
}
class thread2 implements Runnable{
    public void run()
    {
        while(true)
        {
            System.out.println("thread2 is implementing");
        }
    }
}
class work{
    public static void main(String []args)
    {
        Runnable t=new thread1();
        Runnable t2=new thread2();
         t.start();
         t2.run();
    }
    
    
    
    
    
    
    
    
    
    
    
} 
