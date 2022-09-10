package javaapplication1;

public class JavaApplication1 
{

    public static void main(String[] args) 
    {
        try
        {
            int a[]=new int[5];
            a[6]=8;
            int i=7;
            int j=0;
            int k=i/j;
            System.out.println("Output is"+k);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
