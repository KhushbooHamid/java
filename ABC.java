import java.util.Scanner;
class sampleExcep extends Exception{
    public String toString() {
    return "i am toString fxn";
    }


    public String getMsg() {
        return "I am getMsg()";
    }
}
class ABC {
    public static void main(String [] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        try {
            if (a>100) {
                throw new sampleExcep();
            }
        } catch (sampleExcep e) {
            System.out.println(e.getMsg());
             System.out.print(e.toString());
        }
    }
}
