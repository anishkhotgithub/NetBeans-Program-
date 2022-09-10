package UserData;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class HandleEvent1 implements ActionListener
{

    @Override
    public void processAction(ActionEvent ae) throws AbortProcessingException 
    {
        FacesMessage fm=new FacesMessage(FacesMessage.SEVERITY_FATAL, "abc", "Submit Button Clicked");
        FacesContext fc=FacesContext.getCurrentInstance();
        fc.addMessage(ae.getComponent().getClientId(), fm);
    }
    
}
