import javax.swing.*;

class GUI{

    public GUI(){
        JFrame f=new JFrame();
        f.setSize(400,500); //(w,h)

        JTextField t1=new JTextField();
        t1.setBounds(100,100,200,20); //(x,y,w,h)

        JButton b=new JButton("click me");
        b.setBounds(120,200,150,20);

        // frame is not visible by default and layout is border by default
        f.setVisible(true);
        f.setLayout(null);

        // adding objects to frame
        f.add(t1);
        f.add(b);
    }
}

class Test{
    public static void main(String[] args) {
        new GUI();
    }
}