abstract class absClass {
    void fx1()
    {
        System.out.println("hello");
    }
     void fx2()
    {
        System.out.println("welcome");
    }
    abstract void fx3();
}

class derived extends absClass {
    void fx3()
    {
        System.out.println("hi i am over ridden fxn");
    }
}
class Main{
    public static void main(String []args)
    {
        
        derived d=new derived();
        d.fx3();
    }
}
