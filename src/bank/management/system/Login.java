package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login,clear,signup;
    JTextField CardTextField;
    JPasswordField PinTextField;


    Login(){

        setTitle("Automated Tailor Machine");

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No: ");
        cardno.setFont(new Font("Osward",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        CardTextField=new JTextField();
        CardTextField.setBounds(300,150,230,30);
        CardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(CardTextField);

        JLabel pin=new JLabel("PIN: ");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);

        PinTextField=new JPasswordField();
        PinTextField.setBounds(300,220,230,30);
        PinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(PinTextField);

        login=new JButton("Sign in ");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);


        signup=new JButton("Sign Up");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

         if (ae.getSource() == login) {
             Conn c = new Conn();
             String cardnumber = CardTextField.getText();
             String pinnumber = PinTextField.getText();
             String query = " select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";

             try{
                 ResultSet rs = c.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Transactions(pinnumber).setVisible(true);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                 }
             }
             catch (Exception e){
                 System.out.println(e);
             }
        }
        else if(ae.getSource()== clear){
            CardTextField.setText("");
            PinTextField.setText("");
        }
        else if (ae.getSource()==signup) {
             setVisible(false);
             new SignUpOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
