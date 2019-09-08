import java.applet.*;
import java.awt.*;
import java.util.*;
/* <applet code="Myapplet" width="200" height="100"></applet>*/
public class Myapplet extends Applet implements Runnable
{
		Thread t,t1;
		public void start()
		{
			t=new Thread(this);
			t.start();
		}
		public void run()
		{
			t1=Thread.currentThread();
			while(t1==t)
			{
				repaint();
				try
				{
					t1.sleep(1000);
				}
				catch(InterruptedException e)
				{}
			}
		}
		public void paint(Graphics g)
		{
			Calendar c=new GregorianCalendar();
			String hour=String.valueOf(c.get(Calendar.HOUR));
			String minute=String.valueOf(c.get(Calendar.MINUTE));
			String second=String.valueOf(c.get(Calendar.SECOND));
			g.drawString(hour+":"+minute+":"+second,20,30);
		}
}
