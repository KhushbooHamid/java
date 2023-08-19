interface inter {
    public void pdetails();
}

class work {
    public static void details() {
        System.out.println("details");
    }

    public static void threadMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println(5 * i);
        }
    }

}

public class static_ref {
    public static void main(String[] args) {
        System.out.println("method reference");
        inter i = work::details;

        Runnable r = work::threadMethod;
        Thread t1 = new Thread(r);
        t1.start();
    }
}
