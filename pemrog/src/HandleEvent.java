import javax.swing.*;
import java.awt.event;
public class HandleEvent extends JFrame{
    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");

    JPanel panel1 = new JPannel();

    public HandleEvent(){
        ButtonOkListener jbtOkEvent = new ButtonOkListener


        panel1.add(jbtOK);
        panel1.add(jbtCancel);
        add(panel1);

    }
    public static void main(String[] args){
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
