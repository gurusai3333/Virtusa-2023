import java.awt.*;
import java.applet.*;

/*<applet code="Gridlayoutexample.class" width="300" height="300"></applet>*/

public class Gridlayoutexample extends Applet{

public void init(){ 

setLayout (new GridLayout(2,3));
add(new Button("one"));
add(new Button("two"));
add(new Button("three"));
add(new Button("four"));
add(new Button("five"));

}



}