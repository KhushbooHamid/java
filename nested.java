import java.util.Scanner;
public class nested {
    public static void main(String []args)
    {
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value for iteration");
        int i=s.nextInt();
        System.out.println("enter the value for divisor");
        int b=s.nextInt();

        try {
            System.out.println("valued entered at index is " + arr[i]);
            for(int j=0;j<i;j++)
            System.out.println("ratio is " + arr[j] / b);
        }
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }



    }
