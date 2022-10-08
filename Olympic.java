
import java.applet.Applet;
import java.awt.*;

public class Olympic extends Applet {
     public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawOval(10,10,100,100);
        g.setColor(Color.yellow);
        g.drawOval(60,60,100,100);
        g.setColor(Color.black);
        g.drawOval(120,10,100,100);
        g.setColor(Color.green);
        g.drawOval(180,60,100,100);
        g.setColor(Color.red);
        g.drawOval(230,10,100,100);
    }

}