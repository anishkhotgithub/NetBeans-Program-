package model;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Test 
{
    public static void displayEmployees()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        List<Employees> employees=session.createQuery("from model.Employees").list();
        for(Employees employee:employees)
        {
            System.out.println("Employee Id: "+employee.getEmployeeid());
            System.out.println("Employee Name: "+employee.getEmployeename());
            System.out.println("");
        }
    }
    public static void addEmployee()
    {
        Transaction tx=null;
        try
        {
            Employees e=new Employees();
            e.setEmployeeid(103);
            e.setEmployeename("Jay");
            
            SessionFactory factory =NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.save(e);
            tx.commit();
            System.out.println("Employee Data saved Successfully");
        }
        catch(Exception e)
        {
            tx.rollback();
        }
    }
    public static void deleteEmployee()
    {
        Transaction tx=null;
        try
        {
            Employees e=new Employees();
            e.setEmployeeid(103);
            SessionFactory factory=NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.delete(e);
            tx.commit();
            System.out.println("Employee data Deleted");
        }
        catch(Exception e)
        {
            System.out.println(e);
            tx.commit();
        }
    }
    public static void updateEmployee()
    {
        Transaction tx=null;
        try
        {
            Employees e=new Employees();
            e.setEmployeeid(102);
            e.setEmployeename("Pritesh");
            
            SessionFactory factory=NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            tx=session.beginTransaction();
            session.saveOrUpdate(e);
            tx.commit();
            System.out.println("Employee Updated Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
            tx.commit();
        }
    }
    public static void getAllEmployee()
    {
        
        
            SessionFactory factory = NewHibernateUtil.getSessionFactory();
            Session session=factory.openSession();
            List<Employees> employeeses=session.createCriteria(Employees.class).list();
            
            for(Employees employees:employeeses)
            {
                System.out.println("Employee id:"+employees.getEmployeeid());
                System.out.println("Employee name"+employees.getEmployeename());
                System.out.println("");
            }
        
    }
    public static void getEmployeeByID(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.eq("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByID2(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.lt("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByID3(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.gt("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByID4(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.ge("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByID5(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.le("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByID6(int empid)
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.ne("employeeid",empid)).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByName1()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.like("employeename","%M%")).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByName2()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        List<Employees> employeeses=ctx.add(Restrictions.ilike("employeename","%j%")).list();
        
        for(Employees employees:employeeses)
        {
             System.out.println("Employee id:"+employees.getEmployeeid());
             System.out.println("Employee name"+employees.getEmployeename());
             System.out.println("");
        }
    }
    public static void getEmployeeByIdAndName()
    {
        SessionFactory factory=NewHibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Criteria ctx=session.createCriteria(Employees.class);
        
        Criterion ct1=Restrictions.gt("employeeid", 123);
        Criterion ct2=Restrictions.ilike("employeename", "%j%");
        Criterion ct3=Restrictions.and(ct1,ct2);
        
        List<Employees> employees=ctx.add(ct3).list();
        for(Employees employees1:employees)
        {
            System.out.println("Employee Id: "+employees1.getEmployeeid());
            System.out.println("Employee Name: "+employees1.getEmployeename());
            System.out.println("");
        }
    }
    public static void main (String args[])
    {
        //displayEmployees();
        //addEmployee();
        //deleteEmployee();
        //updateEmployee();
        //getAllEmployee();
        //getEmployeeByID(102);
        //getEmployeeByID(103);
        //getEmployeeByID3(101);    
        //getEmployeeByID4(101);
        //getEmployeeByID5(102);
        //getEmployeeByID6(102);
        //getEmployeeByName1();
        //getEmployeeByName2();
        getEmployeeByIdAndName();
        
    }
}
