import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Example extends JFrame implements ActionListener {
    JLabel gender,subject;
    JRadioButton male,female;
    JCheckBox math,physics;

    Example(){
        setSize(600,700);
        setVisible(true);
        setLayout(null);

        gender=new JLabel("Gender");
        subject=new JLabel("Subject");

        male=new JRadioButton("male");
        female=new JRadioButton("female");

        math=new JCheckBox("Maths");
        physics=new JCheckBox("Physics");

        gender.setBounds(100,100,100,30);
        subject.setBounds(100,200,100,30);

        male.setBounds(300,100,100,30);
        female.setBounds(400,100,100,30);

//        female.setSelected(true) to select female by default

        math.setBounds(300,200,100,30);
        physics.setBounds(400,200,100,30);


        add(gender);
        add(male);
        add(female);

        add(subject);
        add(math);
        add(physics);

        ButtonGroup grp=new ButtonGroup();

        grp.add(male);
        grp.add(female);

        male.addActionListener(this);
        female.addActionListener(this);
    }

//    show the checked button in text box
    public void actionPerformed(ActionEvent e){
        if (male.isSelected()){
            System.out.printf("Male");
        }
        if(female.isSelected()){
            System.out.print("Female");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        new Example();
    }
}
