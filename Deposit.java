package BankManagementSystem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Font;
public class Deposit implements Runnable{
    @Override
    public void run(){
        JFrame frame=new JFrame("Bank Management System");
        Container container=frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label=new JLabel("Deposit");
        label.setBounds(100,50,300,30);
        label.setFont(new Font("Consolas",Font.ITALIC,30));
        JLabel nameLabel=new JLabel("Enter Amount");
        nameLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        nameLabel.setBounds(100,100,250,30);
        container.add(nameLabel);
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Consolas",Font.ITALIC,20));
        nameTextField.setBounds(350,100,80,30);
        container.add(nameTextField);
        JButton submit=new JButton("Submit");
        submit.setFont(new Font("Consolas",Font.ITALIC,18));
        submit.setFocusPainted(false);
        submit.addActionListener(e->frame.dispose());
        submit.setBounds(100,150,100,30);
        container.add(submit);
        container.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
        try{
            Thread.sleep(30000L);
        }
        catch(InterruptedException ignored){}
        frame.dispose();
    }
}
