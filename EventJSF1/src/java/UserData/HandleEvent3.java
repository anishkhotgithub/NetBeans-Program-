package UserData;

import java.io.IOException;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class HandleEvent3 implements PhaseListener
{
    static int count;
    @Override
    public void afterPhase(PhaseEvent pe) {
        try
        {
            if(count>1)
                pe.getFacesContext().getExternalContext().redirect("error.xhtml");
            else
                count++;
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public void beforePhase(PhaseEvent pe) {
        System.out.println("Before Phases");
    }

    @Override
    public PhaseId getPhaseId() 
    {
        return PhaseId.ANY_PHASE;
    }
    
}
