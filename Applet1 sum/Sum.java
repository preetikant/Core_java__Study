import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Sum.java" width="300" height="240"></applet> */
public class Sum extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	public void init(){
	l1=new Label("First Number");
	l2=new Label("Second Number");
	t1=new TextField();
	t2=new TextField();
	l3=new Label();
	b=new Button("Add");
	setLayout(null);
	l1.setBounds(30,50,100,20);
	l2.setBounds(30,100,100,20);
	t1.setBounds(150,50,100,20);
	t2.setBounds(150,100,100,20);
	b.setBounds(80,150,80,20);
	l3.setBounds(40,190,80,20);
	add(l1);
	add(l2);
	add(t1);
	add(l3);
	add(t2);
	add(b);
	b.addActionListener(new MyHandler());
	}
	public class MyHandler implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			s=a+b;
			l3.setText("Sum is "+s);
		}
	}
}
