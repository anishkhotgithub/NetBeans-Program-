
package student;

import java.util.Scanner;


public class Student 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String y;
        try
        {
            CreateAcc CA=new CreateAcc();
            DeleteAcc DA=new DeleteAcc();
            UpdateAcc UA=new UpdateAcc();
            ShowAllAcc SA =new ShowAllAcc();
            int num;
            System.out.println("Enter your choice");
            num=sc.nextInt();
            System.out.print("Do want this choice:");
            y=sc.next();
     
        switch(num)
        {
            case 1:   
                if(y.equals("YES")||y.equals("yes"))
                {
                    System.out.println("Lets insert the data: ");
                    CA.CreateAccount();
                }
                else {
                    if(y.equals("NO")||y.equals("no"))
                    {
                        System.out.println("So you dont want to insert the data");
                    }
                }
                break;
            case 2:
                if(y.equals("YES")||y.equals("yes"))
                {
                    System.out.println("lets delete the data");
                    DA.DeleteAccount();
                }
                else if(y.equals("NO")||y.equals("no"))
                {
                    System.out.println("So you dont want to delete data");
                }
                break;
            case 3:
                if(y.equals("YES")||y.equals("yes"))
                {
                    System.out.println("Lets update the data");
                    UA.update();
                }
                else if(y.equals("NO")||y.equals("no"))
                {
                    System.out.println("So you dont want to update data");
                }
                break;
            case 4:
                if(y.equals("Yes")||y.equals("yes"))
                {
                    System.out.println("Lets see all the data");
                    SA.ShowAllAccount();
                }
                else if(y.equals("NO")||y.equals("no"))
                {
                    System.out.println("So you dont want to see all the data");
                }
                break;
            default:
                  System.out.println("Invalid case number");
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }      
}
    
    

