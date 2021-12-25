import javax.swing.*;

class GUI{

    public GUI(){
        JFrame f=new JFrame();
        f.setSize(400,500);

        JTextField t1=new JTextField();
        t1.setBounds(100,100,200,20);

        JButton b=new JButton("click me");
        b.setBounds(120,200,150,20);

        f.setVisible(true);
        f.setLayout(null);

        f.add(t1);
        f.add(b);
    }
}

class Test{
    public static void main(String[] args) {
        new GUI();
    }
}