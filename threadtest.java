class threadtest extends Thread
{
    public threadtest (String name)
    {
        super(name);
    }
        public void run()
        {
            while(true)
            {
            System.out.println("hum dekhege");
            }
        }
    
}
class main{
    public static void main(String []args)
    {
        threadtest t1=new threadtest("iust");
      
        System.out.println(" name is "+ t1.getName());
    }
}
