import javax.swing.*; 
//import java.awt.*;
import java.awt.event.*;

public class Main {  
public static void main(String[] args) {  

    JFrame f=new JFrame("Geotagger");  
    JButton a=new JButton("Input Directory");
    JButton b=new JButton("Run Renamer");  
    JButton c=new JButton("Run Geotagger"); 
    a.setBounds(50,50,200,50);  
    b.setBounds(50,120,200,50);  
    c.setBounds(50,190,200,50);

    /*Jeff - can add the java code to the listeners here. 
             open folders using - 
                */
    a.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){        
      System.out.println("Implement directory chooser here.. //sample-photos ");
      }
    });

    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){        
      System.out.println("Calls Renamer.java class..?? ");
      }
    });

    c.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){        
      System.out.println("Calls Geotagger.java class..?? ");
      }
    });

    f.add(a);  
    f.add(b); 
    f.add(c); 
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);   
  }  
} 
