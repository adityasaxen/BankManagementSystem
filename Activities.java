package BankManagementSystem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
@SuppressWarnings("Deprecated")
public class Activities implements Runnable{
    public void run() {
        JFrame frame = new JFrame("Bank Management System");
        Container container = frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label=new JLabel("Services");
        label.setBounds(100,50,300,30);
        label.setFont(new Font("Consolas",Font.ITALIC,30));
        container.add(label);
        JLabel pinLabel=new JLabel("Pin");
        pinLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        pinLabel.setBounds(100,100,50,30);
        container.add(pinLabel);
        JPasswordField pinTextField=new JPasswordField();
        pinTextField.setFont(new Font("Consolas",Font.ITALIC,20));
        pinTextField.setBounds(170,100,50,30);
        container.add(pinTextField);
        container.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
        JButton withdraw=new JButton("Withdraw");
        withdraw.setFont(new Font("Consolas",Font.ITALIC,30));
        withdraw.setFocusPainted(false);
        withdraw.setBounds(100,150,350,80);
        withdraw.setBackground(new Color(0,0,0));
        withdraw.setForeground(new Color(124,252,0));
        JButton deposit=new JButton("Deposit");
        deposit.setFont(new Font("Consolas",Font.ITALIC,30));
        deposit.setFocusPainted(false);
        deposit.setBounds(100,250,350,80);
        deposit.setBackground(new Color(0,0,0));
        deposit.setForeground(new Color(124,252,0));
        container.add(withdraw);
        container.add(deposit);
        withdraw.addActionListener(e->{
            if(!pinTextField.getText().equals(""))
                new Thread(new Withdraw()).start();
            frame.dispose();
        });
        deposit.addActionListener(e->{
            if(!pinTextField.getText().equals(""))
                new Thread(new Deposit()).start();
            frame.dispose();
        });
        try{
            Thread.sleep(30000L);
        }
        catch(InterruptedException ignored){}
        frame.dispose();
    }
}
