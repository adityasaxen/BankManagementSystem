package BankManagementSystem;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.Font;
@SuppressWarnings("Deprecated")
public class Registration implements Runnable{
    private static final CustomerList customerList=new CustomerList();
    @Override
    public void run(){
        JFrame frame=new JFrame("Bank Management System");
        Container container=frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label=new JLabel("Registration");
        label.setBounds(100,50,300,30);
        label.setFont(new Font("Consolas",Font.ITALIC,30));
        JLabel nameLabel=new JLabel("Name");
        nameLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        nameLabel.setBounds(100,100,100,30);
        container.add(nameLabel);
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Consolas",Font.ITALIC,20));
        nameTextField.setBounds(350,100,250,30);
        container.add(nameTextField);
        JLabel mobileLabel=new JLabel("Mobile Number");
        mobileLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        mobileLabel.setBounds(100,150,300,30);
        container.add(mobileLabel);
        JTextField mobileTextField=new JTextField();
        mobileTextField.setFont(new Font("Consolas",Font.ITALIC,20));
        mobileTextField.setBounds(350,150,250,30);
        container.add(mobileTextField);
        JLabel passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(100,200,300,30);
        passwordLabel.setFont(new Font("Consolas",Font.ITALIC,30));
        container.add(passwordLabel);
        JPasswordField passwordField=new JPasswordField();
        passwordField.setFont(new Font("Consolas",Font.ITALIC,20));
        passwordField.setBounds(350,200,250,30);
        container.add(passwordField);
        JButton button=new JButton("Submit");
        button.setFont(new Font("Consolas",Font.ITALIC,18));
        button.setFocusPainted(false);
        button.setBounds(100,250,100,30);
        button.addActionListener(actionEvent->{
            String name=nameTextField.getText();
            long phone=0L;
		try{
			phone=Long.parseLong(mobileTextField.getText());
		}
		catch(NumberFormatException exception){
			mobileTextField.setForeground(Color.RED);
		}
            String password=passwordField.getText();
            if(!(name.equals(""))&&!(mobileTextField.getText().equals(""))&&!(password.equals(""))) {
                customerList.addCustomer(new Customer(name,phone,password));
                frame.dispose();
            }
        });
        container.add(button);
        //End part
        container.add(label);
        frame.setResizable(false);
        frame.setVisible(true);
        try{
            Thread.sleep(30000L);
        }
        catch(InterruptedException ignored){}
        frame.dispose();
    }
    public static boolean check(String name,String password){
        return customerList.checkDetails(name, password);
    }
}
