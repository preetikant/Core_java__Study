import java.applet.Applet;
import java.awt.*;
/* <applet code="MyApplet" width="200" height="200">/*
 <param name="site" value="This is Preeti Kant"/> </applet> */

public class MyApplet extends Applet
{
	private String defaultMessage="Hello";
	public void paint(Graphics g)
	{
		String s=getParameter("site");
		if(s==null)
		s=defaultMessage;
		g.drawString(s,50,50);
	}
}