
package exception1;

public class Exception1 
{


    public static void main(String[] args) 
    {
            try
            {
                demo1 d1=new demo1();
                d1.validate(15);
            }
            catch(Demo2 e)
            {
                System.err.println("invalid Age");
            }
    }
    
}
