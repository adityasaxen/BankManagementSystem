package BankManagementSystem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Font;
public class Exit implements Runnable{


    @Override
    public void run() {
        JFrame frame=new JFrame("Bank Management System");
        Container container=frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Thank you for using our services");
        label.setBounds(100,50,800,30);
        label.setFont(new Font("Consolas",Font.ITALIC,30));
        container.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
        try{
            Thread.sleep(2000L);
        }
        catch(InterruptedException ignored){}
        System.exit(0);
    }
}
