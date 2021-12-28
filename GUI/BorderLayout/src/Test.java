import javax.swing.*;
import java.awt.*;

class Border extends Frame {
    Border(){
        setSize(400,500);
        setVisible(true);
        setLayout(new BorderLayout());

        Button n=new Button("North");
        Button s=new Button("South");
        Button e=new Button("East");
        Button w=new Button("West");
        Button c=new Button("Center");

        add(n,BorderLayout.NORTH);
        add(s,BorderLayout.SOUTH);
        add(e,BorderLayout.EAST);
        add(w,BorderLayout.WEST);
        add(c,BorderLayout.CENTER);
    }
}

public class Test {
    public static void main(String[] args) {
        new Border();
    }
}
