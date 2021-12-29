import javax.swing.*;
import java.awt.*;

class Example extends Frame{
    Example(){
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
//      other options include BoxLayout.X_AXIS

        setVisible(true);
        setSize(400,500);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

    }
}

public class Test {
    public static void main(String[] args) {
        new Example();
    }
}
