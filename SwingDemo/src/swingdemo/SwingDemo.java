
package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SwingDemo implements ActionListener
{
    JFrame jf;
    JTextField jt;
    JButton jb;

    public SwingDemo()
    {
       jf=new JFrame();
       jt=new JTextField();
       jt.setBounds(140, 100, 100, 30);
        
       jb=new JButton("Submit");
       jb.setBounds(140, 130, 100, 30);
        
       jb.addActionListener(this);
       
       jf.add(jb);
       jf.add(jt);
       jf.setSize(400,400);
       jf.setLayout(null);
       jf.setVisible(true);
    }
    
    
    public static void main(String[] args) 
    {
        SwingDemo sd=new SwingDemo();
       
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String name=jt.getText();
        try{
            if(name.equals("Anish"))
            {
                JOptionPane.showMessageDialog(jt, "Welcome" +name);
                NextJframe nf=new NextJframe();
                jf.setVisible(false);
                nf.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(jt, "Invalid name " +name);
            }
        }
        catch(Exception e)
        {
            
        }
    }
    
}
