import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// create an add and sub gui
class UI extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton b1,b2;

    public UI(){
        setSize(400,600);
        setLayout(null);
        setVisible(true);

        t1=new JTextField();
        t1.setBounds(100,100,200,20);

        t2=new JTextField();
        t2.setBounds(100,200,200,20);

        t3=new JTextField();
        t3.setBounds(100,300,200,30);
        t3.setEditable(false);

        b1=new JButton("add");
        b1.setBounds(50,400,100,30);

        b2=new JButton("sub");
        b2.setBounds(250,400,100,30);

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());

        if(e.getSource()==b1){

            t3.setText(String.valueOf(a+b));       
        }else{
            t3.setText(String.valueOf(a-b));
        }
    }
}

class Test{
    public static void main(String[] args) {
        new UI();
    }
}