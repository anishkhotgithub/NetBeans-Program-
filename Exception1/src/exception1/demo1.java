
package exception1;

public class demo1 
{
    public void validate(int age) throws Demo2
    {
        if(age<18)
            throw new Demo2("Invalid age");
    }
}
