
package books;

import java.util.Scanner;


public class Books extends UserBookDetails
{


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String TypeOfBook;
        
        System.out.print("Enter the type of book:");
        TypeOfBook=sc.nextLine();
        if(TypeOfBook.equals("Hardware")||TypeOfBook.equals("Hard"))
        {
        HardwareBook hb=new HardwareBook();
        hb.showDetails();
        }
        else if(TypeOfBook.equals("Software"))
        {
            SoftwareBooks sb=new SoftwareBooks();
            sb.showDetails();
        }
        
    }
    
}
