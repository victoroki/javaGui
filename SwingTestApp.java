
import javax.swing.*;

public class SwingTestApp extends JFrame {
	//reference 
	JPanel panel;
	JLabel label;
	JButton button;

	public static void main(String [] args){
		new testApp();
	}


	//constructor
	public SwingTestApp(){
		Framecomponents();
		appLabel();
	}
	
	private void appLabel(){
		label.setText("set text");
	}
	protected void Framecomponents(){
		setTitle("hello world");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(label);
	}
}
