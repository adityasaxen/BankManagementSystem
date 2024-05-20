package BankManagementSystem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
@SuppressWarnings("Deprecated")
public class Login implements Runnable{
    @Override
    public void run() {
        JFrame frame = new JFrame("Bank Management System");
        Container container = frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Login");
        label.setBounds(100, 50, 300, 30);
        label.setFont(new Font("Consolas", Font.ITALIC, 30));
        JLabel nameLabel=new JLabel("Name");
        nameLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        nameLabel.setBounds(100,100,100,30);
        container.add(nameLabel);
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Consolas",Font.ITALIC,20));
        nameTextField.setBounds(350,100,250,30);
        container.add(nameTextField);
        JLabel passwordLabel=new JLabel("Password");
        passwordLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        passwordLabel.setBounds(100,150,300,30);
        container.add(passwordLabel);
        JPasswordField passwordField=new JPasswordField();
        passwordField.setFont(new Font("Consolas",Font.ITALIC,20));
        passwordField.setBounds(350,150,250,30);
        container.add(passwordField);
        container.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
        JButton button=new JButton("Submit");
        button.setFont(new Font("Consolas",Font.ITALIC,18));
        button.setFocusPainted(false);
        button.setBounds(100,200,100,30);
        container.add(button);
        button.addActionListener(e->{
            String name=nameTextField.getText();
            String password=passwordField.getText();
            if(!(name.equals("")&&password.equals(""))){
                if(Registration.check(name,password))
                       new Thread(new Activities()).start();
                else{
                    nameTextField.setForeground(Color.RED);
                    passwordField.setForeground(Color.RED);
                }
                frame.dispose();
            }
        });
        try{
            Thread.sleep(30000L);
        }
        catch(InterruptedException ignored){}
        frame.dispose();
    }
}
