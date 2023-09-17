import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Practical11DebugCode" width=300 height=200></applet>*/

public class Practical11DebugCode extends Applet implements MouseListener{
	
	Label l = new Label("Hello mouse");
	
	public void init(){
		
		setLayout(null);
		
		l.setBounds(50,150,200,100);
		add(l);
		
	}
	
	public void mousePressed(MouseEvent me){
		
		l.setText("Mouse pressed no of clicks : "+me.getClickCount()+" at position : "+me.getX()+" , "+me.getY());
		
	}
	public void mouseReleased(MouseEvent me){
		
		l.setText("Mouse released");
		
	}
	public void mouseEntered(MouseEvent me){
		
		l.setText("Mouse Entered");
		
	}
	public void mouseExited(MouseEvent me){
		
		l.setText("Mouse Exited");
		
	}
	public void mouseClicked(MouseEvent me){
		
		l.setText("Mouse Clicked");
		
	}
	
}