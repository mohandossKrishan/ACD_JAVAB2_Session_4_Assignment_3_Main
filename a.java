class C{
   void test(){System.out.println("I'm from the top class");}
}
class B extends C{}

public class A extends B{
  
   public static void main(String[] args) {
     super.test();
   }
}
