// creating a frame with 2 textfield where t1 shows if the pointer is inside or outside the frame and t2 should display X and Y co-ordinates when user moves the pointer inside 

import javax.swing.*;
import java.awt.event.*;

class Example extends JFrame implements MouseListener,MouseMotionListener{
    JTextField t1,t2;

    Example(){
       setSize(400,500); 
       setVisible(true);
       setLayout(null);

        t1=new JTextField();
        t1.setBounds(100,100,200,20);

        t2=new JTextField();
        t2.setBounds(100,200,200,20);

        add(t1);
        add(t2);

        // adding mouselistener and mousemotionlistener to frame
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // function when mouse enters the frame
    public void mouseEntered(MouseEvent e){
        t1.setText("in");
    }

    // function when mouse exits the frame
    public void mouseExited(MouseEvent e){
        t1.setText("out");
    }

    // function to display X and Y co-ordinates of the mouse
    public void mouseMoved(MouseEvent e){
        String info="X: "+e.getX()+" Y: "+e.getY();
        t2.setText(info);
    }

    // all the functions must be overwrited when using mouse events
    public void mouseDragged(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
}

class Test{
    public static void main(String[] args){
        new Example();
    }
}