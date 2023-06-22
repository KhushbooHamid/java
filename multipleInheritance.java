interface multipleInheritance {
     void fx1();
     void fx2();
}
interface anotherClass {
    void fx3();
    void fx4();
}
class Child implements multipleInheritance, anotherClass
{
    public void fx1()
    {
        System.out.println("i am fx1");
    }

    public void fx2()
    {
        System.out.println("i am fx2");
    }

    public void fx3()
    {
        System.out.println("i am fx3");
    }

    public void fx4()
    {
        System.out.println("i am fx4");
    }
}

class Main{
    public static void main(String []args)
    {
        Child c= new Child();
        c.fx1();
        c.fx2();
        c.fx3();
        c.fx4();
    }
}
