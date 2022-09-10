
import java.util.List;
import model.Product;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 
{
    public static void getProductDetails()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Product> product=session.createSQLQuery("select * from Product").addEntity(Product.class).list();
        
        for(Product product1:product)
        {
            System.out.println("Product id :" +product1.getProductid());
            System.out.println("Product name:" +product1.getProductname());
            System.out.println("");
        }
    }
    public static void getProductByID(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        SQLQuery sQLQuery=session.createSQLQuery("select * from Product where productid=?").addEntity(Product.class);
        List<Product> products= sQLQuery.setParameter(0, id).list();
        for(Product product:products)
        {
            System.out.println("Product id :" +product.getProductid());
            System.out.println("Product name:" +product.getProductname());
            System.out.println("");
        }
    }
    public static void getProductByID2(int id)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        SQLQuery sQLQuery=session.createSQLQuery("select * from Product where productid= :productid").addEntity(Product.class);
        List<Product> products= sQLQuery.setParameter("productid", id).list();
        for(Product product:products)
        {
            System.out.println("Product id :" +product.getProductid());
            System.out.println("Product name:" +product.getProductname());
            System.out.println("");
        }
    }
    public static void main(String[] args) 
    {
        //getProductDetails();
        //getProductByID(102);
        getProductByID2(101);
    }
}
