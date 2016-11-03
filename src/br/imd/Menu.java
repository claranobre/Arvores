package br.imd;

import java.awt.*;
import java.awt.event.*;

public class Menu {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	
	public Menu(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		Menu menu = new Menu();
		menu.showCanvasDemo();
	}
	
	 private void prepareGUI(){
	      mainFrame = new Frame("MENU");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      headerLabel = new Label();
	      headerLabel.setAlignment(Label.CENTER);
	      statusLabel = new Label();        
	      statusLabel.setAlignment(Label.CENTER);
	      statusLabel.setSize(350,100);

	      controlPanel = new Panel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);
	 }

	 private void showCanvasDemo(){
		 headerLabel.setText("Control in action: Canvas"); 

	     controlPanel.add(new MyCanvas());
	     mainFrame.setVisible(true);  
	 } 
	 
	   class MyCanvas extends Canvas {

		      public MyCanvas () {
		         setBackground (Color.GRAY);
		         setSize(300, 300);
		      }

		      public void paint (Graphics graphics) {
		    	  graphics.setColor(new Color(0,0,255));
		    	  graphics.drawOval(50, 50, 100, 100);
		         
		    	 Graphics2D g2;
		         g2 = (Graphics2D) graphics;
		         g2.drawString ("01", 70, 70);
		      }
	   }
}

public class Teste {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setTitle("Teste");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        No n = new No(12);
        f.add(n);
    }
}
