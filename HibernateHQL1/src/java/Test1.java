
import java.util.List;
import model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Test1 
{
    public static void getProductDetails()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Product> product=session.createQuery("from model.Product").list();
        
        for(Product product1:product)
        {
            System.out.println("Employee id :" +product1.getProductid());
            System.out.println("Employee name : "+product1.getProductname());
            System.out.println("");
        }
    }
    public static void getProductByID(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("from model.Product where productid=?");
        List<Product> product=query.setParameter(0, id).list();
        
        for(Product product1:product)
        {
            System.out.println("Employee id :" +product1.getProductid());
            System.out.println("Employee name : "+product1.getProductname());
            System.out.println("");
        }
    }
    public static void getProductByID2(int id)
    {
           SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("from model.Product where productid= :i");
        List<Product> product=query.setParameter("i", id).list();
        
        
        for(Product product1:product)
        {
            System.out.println("Employee Id: "+product1.getProductid());
            System.out.println("Employee Name: "+product1.getProductname());
            System.out.println("");
        }
    }
    public static void main(String[] args) 
    {
        //getProductDetails();
        //getProductByID(101);
        getProductByID2(102);
    }
}
