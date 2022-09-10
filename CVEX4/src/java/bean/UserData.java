package bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

@ManagedBean
public class UserData 
{
    private String username;
    private String password;
    private String mobile;
    
    
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void validateMobile(FacesContext fc,UIComponent uic,Object o)
    {
        String Mobile =(String)o;
        Pattern p=Pattern.compile("^\\d{10}$");
        Matcher m=p.matcher(Mobile);
        
        if(!(m.find()))
        {
            ((UIInput)uic).setValid(false);
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL,"abc", "Invalid Number");
            fc.addMessage(uic.getClientId(),fm);
        }
    }
    public void validatePassword(FacesContext fc,UIComponent uic,Object o)
    {
        String password =(String)o;
        Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%_]).{8,16}");
        Matcher m=p.matcher(password);
        
        if(!(m.find()))
        {
            ((UIInput)uic).setValid(false);
            FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL,"abc", "Weak Password");
            fc.addMessage(uic.getClientId(),fm);
        }
    }
}
