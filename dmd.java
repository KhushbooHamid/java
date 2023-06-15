 class student
 {
     void welcome()
     {
         System.out.println("hello and welcome");
     }
 }
 class Main extends student
 {
     void welcome()
     {
         System.out.println("hello and welcome six sem");
     }
      
     void sem()
     {
         System.out.println("be happy");
     }
}
class main{
     public static void main(String[] args)
     {
         student s=new student();
         s.welcome();
         
         Main s1=new Main();
         s1.sem();
         s1.welcome();
         
         student t=new Main();
         t.welcome();
      //   t.sem();  gives error 
               System.out.println("khushboo hamid");

         
     }
 }
