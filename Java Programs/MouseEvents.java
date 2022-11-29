import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Action1.class" width="300" height="300">
</applet>
*/

public class Action1 extends Applet implements MouseListener
{
String str="";


public void init()
{
addMouseListener(this);// registering listener
}


public void mousePressed(MouseEvent e)
{
setBackground(Color.yellow);
str = "You pressed mouse";
repaint();
}

public void mouseReleased(MouseEvent e)
{
setBackground(Color.red);
str = "You released mouse";
repaint();
}  
public void mouseClicked(MouseEvent e)
{

setBackground(Color.orange);
str = "You clicked mouse";
repaint();
}  
public void mouseEntered(MouseEvent e)
{
setBackground(Color.cyan);
str = "Mouse entered frame";
repaint();

}  
public void mouseExited(MouseEvent e)
{
setBackground(Color.pink);
str = "Mouse existed ";
repaint();
}
// write paint() method to draw on applet window
public void paint(Graphics g)
{

g.drawString(str, 75, 150);


}
}
