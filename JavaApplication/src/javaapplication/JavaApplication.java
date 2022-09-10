package javaapplication;

public class JavaApplication 
{

    public static void main(String[] args) 
    {
        CharStack stack=new CharStack(40);
        String str="hctib olleh  ";
        System.out.println("Orignal String:"+str);
        int length=str.length();
        
        for(int i=0;i<length;i++)
        {
            stack.push(str.charAt(i));
        }
        System.out.println("Reversed String");
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
 
        }
        System.out.println();
    }
    
}
