public class arith_exception
{

    static void func() throws ArithmeticException 
    { 
        try
        {
            int x=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            throw new ArithmeticException("You divided by 0...oops"); 
        }
    } 
    public static void main(String args[])
    {
        int a=10;
        int b=0;

        try
        {
            func();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Inside finally block");
        }

    }
}