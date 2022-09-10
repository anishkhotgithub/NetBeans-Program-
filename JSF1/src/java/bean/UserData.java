package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserData 
{
    private int studid,English,Science,Maths;

    public int getMaths() {
        return Maths;
    }

    public void setMaths(int Maths) {
        this.Maths = Maths;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public void setEnglish(int English) {
        this.English = English;
    }

    public void setScience(int Science) {
        this.Science = Science;
    }

    public int getStudid() {
        return studid;
    }

    public int getEnglish() {
        return English;
    }

    public int getScience() {
        return Science;
    }
   
    
    
}
