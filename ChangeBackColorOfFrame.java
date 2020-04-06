import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ChangeBackColorFrame
{
    ChangeBackColorFrame()
    {
        Button b = new Button("Enter");
        Choice c = new Choice();
        Frame f = new Frame("Change Background Color Of Frame ");
        f.setBounds(50,50,700,700);
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
		c.add("Yellow");
        c.setBounds(150,50,400,400);
        b.setBounds(25,50,100,50);
        f.add(b);
        f.add(c);
            b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            String st = c.getItem(c.getSelectedIndex());  
            if(st.equals("Red"))
            f.setBackground(Color.RED);
            else if(st.equals("Blue"))
                f.setBackground(Color.BLUE);
            else if(st.equals("Green"))
                f.setBackground(Color.GREEN);
            else if(st.equals("Orange"))
                f.setBackground(Color.ORANGE);
			else if(st.equals("Yellow"))
                f.setBackground(Color.YELLOW);
            else
                f.setBackground(Color.WHITE);
    }  
    });  
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
public class ChangeBackColorOfFrame {
  
    public static void main(String[] args)
  {
      ChangeBackColorFrame cbf = new ChangeBackColorFrame();
  }        
}
