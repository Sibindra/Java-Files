import javax.swing.*;
import java.awt.*;

class Example extends JFrame{
    Example(){
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");

        setLayout(new GridLayout(3,2)); //rows.columns

        setVisible(true);
        setSize(400,500);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}

public class Test {
    public static void main(String[] args) {
        new Example();
    }
}
