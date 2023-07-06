
class thread1 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("thread1 is implementing");
            System.out.println("work efficient");
        }
    }
}
class thread2 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("thread2 is implementing");
            System.out.println("good work ");
        }
    }
}
class work{
    public static void main(String []args)
    {
        thread1 t=new thread1();
        thread2 t2=new thread2();
         t.run();
         t2.run();
    }
    
    
    
    
    
    
    
    
    
    
    
} 
