
import java.util.Scanner;
class UserDef
{
    int a,b;
    Scanner s = new Scanner(System.in);
    void setData()
    {
        int a,b;
        System.out.println("Enter the value of first number: ");
        a=Integer.parseInt(s.nextLine());
        System.out.println("Enter the value of second number: ");
        b=Integer.parseInt(s.nextLine());        
        this.a=a;
        this.b=b;
    }
    void showResult()
    {
        System.out.println("The Division of two number are:"+(a/b));
    }
}
public class ArithmeticExcep {
    public static void main(String[] args)
    {
        UserDef ud = new UserDef();
        try{
            ud.setData();
            ud.showResult();
        }
        catch(ArithmeticException e)
        {
            System.out.println(" Arithmetic exception occured please enter again");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception occured please enter again");
        }
    }
}
