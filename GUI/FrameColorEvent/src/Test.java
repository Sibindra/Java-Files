import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Example extends JFrame {
    JTextField t;
    JButton b;

    Example(){
        setTitle("Test");
        setVisible(true);

        setSize(400,500);
        t=new JTextField("This is a text-field");

        b=new JButton("click me ");


        setLayout(new FlowLayout());
        add(t);
        add(b);

        Controller c=new Controller(this);
        b.addActionListener(c);
    }
}

class Controller implements ActionListener{
    Example obj;

    Controller(Example obj){
        this.obj=obj;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.obj.t.setBackground(Color.GRAY);

        Font f=new Font("Arial",Font.BOLD,14);
        this.obj.t.setFont(f);
    }
}

class Test{
    public static void main(String[] args) {
        new Example();
    }
}