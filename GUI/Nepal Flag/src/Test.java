import java.awt.*;
import java.awt.event.*;

class Example extends Frame{
    Example(){
        setSize(400,500);
        setVisible(true);
    }

    public void paint(Graphics g){
        int[] x1={20,200,20};
        int[] y1={20,70,120};

        g.setColor(Color.RED);
        g.fillPolygon(x1,y1,3);

        int[] x2={20,200,20};
        int[] y2={120,170,220};

        g.fillPolygon(x2,y2,3);
        g.setColor(Color.BLACK);
        g.drawLine(20,20,20,300);
    }
}

public class Test {
    public static void main(String[] args) {
        new Example();
    }
}
