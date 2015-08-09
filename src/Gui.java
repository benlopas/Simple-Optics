import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame{

        
        private JComboBox box;
        private JLabel picture;
        
        private static String[] filename = {"Laser.png","Modulator.png","Mirror.png","Link.png","Fibre_Link.png"};
        public Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
                           new ImageIcon(getClass().getResource(filename[1])),
                           new ImageIcon(getClass().getResource(filename[2])),
                           new ImageIcon(getClass().getResource(filename[3])),
                           new ImageIcon(getClass().getResource(filename[4]))};
        
 
        
        
        public Gui(){
          super("Fibre Optics");
          setLayout(new FlowLayout());
        
          box = new JComboBox(filename);
          
          
        
          box.addItemListener(
                new ItemListener(){
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                  }
                );
                
                add(box);
                picture=new JLabel(pics[0]);
                add(picture);
                
                
                
             }

            
        }
