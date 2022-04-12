import javax.swing.*;
import java.awt.*;

public class Test {
    Test(){
        JFrame f=new JFrame("test frame");
        f.setSize(500,500);

        JPanel p1=new JPanel();
        p1.setBackground(Color.RED);

        JPanel p2=new JPanel();
        p2.setBackground(Color.BLUE);

        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setVisible(true);
        f.add(p1);
        f.add(p2);
    }

    public static void main(String[] args) {
        new Test();
    }
}
