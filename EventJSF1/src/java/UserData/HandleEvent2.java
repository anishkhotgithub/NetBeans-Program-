package UserData;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;


public class HandleEvent2 implements ValueChangeListener
{
    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException 
    {
        System.out.println("Textbox is changed. Something new is typed or erased.");
    }
}
