package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class EmployeeeBean
{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void validator(FacesContext fc,UIComponent uic,Object o) throws ValidatorException
    {
         int age=(int)o;
         if(!(age>=18 && age<=60))
         {
             FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL, "abc", "Invalid Age");
             ((UIInput)uic).setValid(false);
             fc.addMessage(uic.getClientId(), fm);
         }
    }
}
