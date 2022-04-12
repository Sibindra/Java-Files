import javax.swing.*;
import java.awt.*;

public class Test extends JPanel {
    Test(){
        JFrame f=new JFrame("test frame");
        f.setSize(500,500);

        JPanel p=new JPanel();
        p.setBounds(100,100,100,100);

        f.setLayout(null);
        p.setBackground(Color.RED);
        f.setVisible(true);
        f.add(p);
    }

    public static void main(String[] args) {
        new Test();
    }
}
