import java.awt.*;

class Example extends Frame{
    Example(){
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");

        setVisible(true);
        setSize(400,500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
//      other options include FlowLayout.RIGHT,FlowLayout.LEFT,FlowLayout.LEADING,FlowLayout.Trailing

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
