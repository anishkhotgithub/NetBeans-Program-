package javaapplication3;
interface abc  
{
    public void show1();
}
interface abcd  
{
    public void show2();
}
class A
{
    public void show1()
    {
        System.out.println("Hello Esha");
    }
       public void show2()
    {
        System.out.println("Hello Esha 2");
    }
}

public class JavaApplication3 
{
    public static void main(String[] args)
    {
        A a=new A();
        a.show1();
        a.show2();
    }
}
