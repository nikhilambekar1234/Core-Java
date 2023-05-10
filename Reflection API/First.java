import java.applet.Applet;
import java.awt.Graphics;

public class First extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome",50,50);
	}
}
//javac First.java
//javac MyViewer.java
//java MyViewer First