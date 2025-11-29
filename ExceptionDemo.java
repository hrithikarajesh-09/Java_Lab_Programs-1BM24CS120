import java.util.Scanner;
 class WrongAge extends Exception{
    public WrongAge(String msg)
    {
        super(msg);
    }
}
 class Father{
    int Fage;
    public Father(int Fage) throws WrongAge{
        if(Fage<0){
            throw new WrongAge("Father age cannot be nagative");
        }
        this.Fage=Fage;
        System.out.println("Father age is successfully set to "+Fage);
    }
}
class Son extends Father{
    int Sage;
    public Son(int Fage,int Sage) throws WrongAge{
        super(Fage);
        if(Fage<Sage){
            throw new WrongAge("Father age cannot be lower than Son age");
        }
        this.Sage=Sage;
         System.out.println("Son age is successfully set to "+Sage);
    }
}
public class ExceptionDemo {
  public static void main(String[] args) {
      try {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter Fathers Age:");
        int Fage= sc.nextInt();
        System.out.println("Enter Son's Age:");
        int Sage= sc.nextInt();
        Son s = new Son(Fage, Sage);

      } catch (WrongAge e) {
        System.out.println("Caught: "+e.getMessage());
      }
  }
    
}
