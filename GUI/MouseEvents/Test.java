import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import org.w3c.dom.events.MouseEvent;

class Example extends JFrame implements MouseListener,MouseMotionListener{
    JTextField t1,t2;

    Example(){
        setSize(400,500);
        setVisible(true);
        setLayout(null);

        t1=new JTextField();
        t1.setBounds(100,100,200,20);

        t2=new JTextField();
        t2.setBounds(100,200,200,30);

        add(t1);
        add(t2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e){
        t1.setText("in");
    }

    public void mouseExicted(MouseEvent e){
        t1.setText("out");
    }

    public void mouseMoved(MouseEvent e){
        String msg="x: "+((Component) e).getX()+"y: "+((Component) e).getY();
        t2.setText(msg);
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        // TODO Auto-generated method stub
        super.addMouseListener(l);
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        // TODO Auto-generated method stub
        super.addMouseMotionListener(l);
    }
}

class Test{
    public static void main(String[] args) {
        new Example();
    }
}