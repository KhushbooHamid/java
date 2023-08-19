interface inter{
    public student getDetails();
}

class student{
    public student()
    {
        System.out.println("constructor");
    }
    public void details()
    {
        System.out.println("details");
    }
}

public class cons_ref {
    public static void main(String []args)
    {
        inter i=student::new;
        student s=i.getDetails();
        s.details();
    }
}
