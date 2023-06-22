interface vehicle{
    String name="myCar";
    void display();

}

abstract class car{
    abstract void fx1();
    public void displayWheels()
    {
        System.out.println("no of wheels are 4");
    }

}
class bike implements vehicle{
    public void display()
    {
        System.out.println("no of wheels are 2");
    }
}

class nano extends car{
    public void display()
    {
        System.out.println("no of wheels are 2");
    }
    public void fx1()
    {
        System.out.println("hello");

    }
}

public class abstractClass extends nano
{
    @Override
    public void displayWheels() {
        System.out.println("I have 6 wheels");
    }
    public static void main(String[] args) {
        System.out.println("hello");
   nano c=new nano();
    c.display();
    c.fx1();

    }

}
