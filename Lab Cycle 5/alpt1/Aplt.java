package alpt1;

import java.applet.Applet;
import java.awt.*;
public class Aplt extends Applet{
public void paint(Graphics g)
{
g.draw3DRect(40,30, 40, 30, true);
g.draw3DRect(30, 40, 40, 30, true);
g.drawOval(50, 20, 30, 50);
g.fill3DRect(40,30, 40, 30, true);
}
}