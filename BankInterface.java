package BankManagementSystem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
public class BankInterface{
    public BankInterface(){
        init();
    }
    private void init(){
        JFrame frame=new JFrame("Bank Management System");
        Container container =frame.getContentPane();
        container.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Heading  and lineLabel start
        JLabel label=new JLabel("Bank Management System");
        label.setBounds(550,0,400,30);
        JLabel lineLabel=new JLabel("__________________________________________________________");
        lineLabel.setBounds(550,5,400,30);
        container.add(lineLabel);
        label.setFont(new Font("Consolas",Font.PLAIN,30));
        label.setForeground(new Color(75,0,130));
        container.add(label);
        //Heading  and lineLabel end
        //Information label start
        JLabel informationLabel1=new JLabel("Welcome to the City Bank of India.We provide 24/7 service to our customers");
        JLabel informationLabel2=new JLabel("and offers loan at lower rate of interest.Rated amongst top 10 banks in India.");
        JLabel informationLabel3=new JLabel("We have 2,256 branches all over in India.");
        informationLabel1.setFont(new Font("Consolas",Font.ITALIC,30));
        informationLabel1.setBounds(100,50,1400,30);
        container.add(informationLabel1);
        informationLabel2.setFont(new Font("Consolas",Font.ITALIC,30));
        informationLabel2.setBounds(100,85,1400,30);
        container.add(informationLabel2);
        informationLabel3.setFont(new Font("Consolas",Font.ITALIC,30));
        informationLabel3.setBounds(100,120,800,30);
        container.add(informationLabel3);
        //Information label end
        //Our services label start
        JLabel ourServiceLabel=new JLabel("Our Services");
        ourServiceLabel.setFont(new Font("TimesNewRoman",Font.PLAIN,30));
        ourServiceLabel.setForeground(new Color(0,191,255));
        ourServiceLabel.setBounds(100,200,200,30);
        container.add(ourServiceLabel);
        //Our services label end
        //Buttons menu start
        JButton newCustomer=new JButton("New Customer");
        newCustomer.setFont(new Font("Cascade Code",Font.PLAIN,30));
        newCustomer.setBounds(100,300,350,80);
        newCustomer.setForeground(new Color(124,252,0));
        newCustomer.setBackground(new Color(0,0,0));
        newCustomer.setCursor(new Cursor(Cursor.HAND_CURSOR));
        newCustomer.setFocusPainted(false);
        container.add(newCustomer);
        JButton customerLogin=new JButton("Customer Login");
        customerLogin.setFont(new Font("Cascade Code",Font.PLAIN,30));
        customerLogin.setBounds(100,430,350,80);
        customerLogin.setForeground(new Color(124,252,0));
        customerLogin.setBackground(new Color(0,0,0));
        customerLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        customerLogin.setFocusPainted(false);
        container.add(customerLogin);
        customerLogin.addActionListener(e->new Thread(new Login()).start());
        JButton exit=new JButton("Exit");
        exit.setFont(new Font("Cascade Code",Font.PLAIN,30));
        exit.setBounds(100,540,350,80);
        exit.setForeground(new Color(124,252,0));
        exit.setBackground(new Color(0,0,0));
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
        container.add(exit);
        exit.addActionListener(actionEvent->{
            frame.dispose();
            new Thread(new Exit()).start();
        });
        newCustomer.addActionListener(actionEvent->new Thread(new Registration()).start());
        //Buttons menu end
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

