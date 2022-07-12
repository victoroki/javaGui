import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;


public class SwingApp extends JFrame implements ActionListener{

    //references of the Swing components
    JButton btnButtonClicks;
    JLabel LbLDisplay;
    Container contentPane;
    JPanel jplComp;
    

    //declare a variable to represent number of clicks 
    int noOfClicks;

    //main method
    public static void main(String []args){
        new SwingApp();
    }//end of main

    //constructor
    public SwingApp(){
        //create component objects
        createComponents();
        CreateContainer();
        addComponents();
        handleEvents();
        //set frame properties
        createFrame();
        }//end of constructor

    private void createFrame(){
       //set frame properties
        setTitle("GUI Application");
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void createComponents(){
        //create component objects
        noOfClicks = 0;
        btnButtonClicks = new JButton("I'm a swing button !");
        LbLDisplay = new JLabel("Number of button clicks:" + noOfClicks);
    }
    private void CreateContainer(){
        //create container object
        contentPane = getContentPane();
        jplComp = new JPanel();
    }
    public void addComponents(){
        jplComp.add(btnButtonClicks);
        jplComp.add(LbLDisplay);
        contentPane.add(jplComp);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnButtonClicks){
            noOfClicks++;
            LbLDisplay.setText("Number of button clicks:" + noOfClicks);
        }
    }//end of actionPerformed
    public void handleEvents(){
        btnButtonClicks.addActionListener(this);
    }
}
