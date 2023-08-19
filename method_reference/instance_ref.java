
interface inter{
    public void pdetails();
}
class work{
    public void num()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(5*i);
        }
    }
}

public class instance_ref {
    public static void main(String []args)
    {
        System.out.println("method reference");
        work w=new work();
        Runnable r=w::num;
        Thread t1=new Thread(r);
        t1.start();
    }
}
