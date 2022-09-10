
package classes;

import java.util.Formatter;
import java.util.Locale;

class Point
{
    int x,y;
    double getDistance()
    {
        return(Math.sqrt(x*x+y*y));
    }
}
public class Classes {

    public static void main(String[] args)
    {
        System.out.println("creating a Point object...");
        Point p1=new Point();
        System.out.println("Initializing object..");
        p1.x=3;
        p1.y=4;
        double distance=p1.getDistance();
        StringBuilder s=new StringBuilder();
        Formatter f=new Formatter(s,Locale.US);
        f.format("Distance of Point p(" +p1.x+ ","+p1.y+")from Origin is %.02f",distance);
        System.out.println(s);
        System.out.println();
        s.delete(0,s.length());
        System.out.println("Creating another point object...");
        Point p2=new Point();
        System.out.println("Initilazing object...");
        p2.x=8;
        p2.y=9;
        distance=p2.getDistance();
        f.format("Distance of Point p(" +p2.x+ ","+p2.y+")from Origin is %.02f",distance);
        System.out.println(s);
    }
    
}
