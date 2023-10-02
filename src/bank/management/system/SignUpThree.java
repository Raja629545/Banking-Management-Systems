package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    SignUpThree(String formno){

        this.formno=formno;

        setLayout(null);

        JLabel j1=new JLabel("Page 3: Account Details..");
        j1.setFont(new Font("Raleway",Font.BOLD,22));
        j1.setBounds(280,40,400,40);
        add(j1);

        JLabel type=new JLabel("Account type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);


        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);


        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,150,20);
        add(r3);


        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);


        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number=new JLabel("XXXX-XXXX-XXXX-4185");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel carddetail=new JLabel("Your 16 Digit card number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);


        JLabel pin=new JLabel("Pin:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);

        JLabel pindetail=new JLabel("Your 4 Digit password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);


        JLabel sevices=new JLabel("Sevices Required:");
        sevices.setFont(new Font("Raleway",Font.BOLD,22));
        sevices.setBounds(100,450,200,30);
        add(sevices);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);


        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);


        c4=new JCheckBox("Email and SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);


        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);


        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);


        c7=new JCheckBox("I hearby declare that above information that was entered by me was true.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);


        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,12));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);


        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,12));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.WHITE);



        setSize(850,820);
        setLocation(350,0);
        setVisible(true);


    }

    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype=null;
            if(r1.isSelected()){
                accounttype="Saving Account";
            } else if (r2.isSelected()) {
                accounttype="Fixed Deposit";
            } else if (r3.isSelected()) {
                accounttype="Current Account";
            } else if (r4.isSelected()) {
                accounttype="Recurring Deposit Account";
            }

            Random random=new Random();
            String cardnumber= " " + Math.abs((random.nextLong() % 90000000L)+504093600000000L);

            String pinnumber= " " + Math.abs((random.nextLong() % 9000L)+1000L);

            String facility= "";
             if(c1.isSelected()){
                 facility= facility + "ATM Card";
             } else if (c2.isSelected()) {
                 facility=facility + "Internet Banking";
             } else if (c3.isSelected()) {
                 facility=facility + "Mobile Banking";
             } else if (c4.isSelected()) {
                 facility=facility + "Email and SMS Alert";
             } else if (c5.isSelected()) {
                 facility=facility + "Cheque Book";
             } else if (c6.isSelected()) {
                 facility= facility + "E-Statement";
             }


            try {
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type Required");
                }else {
                    Conn conn=new Conn();

                    String query1="insert into SignUpThree values ('"+formno+"' , '"+ accounttype + "', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";

                    String query2="insert into login values ('"+formno+"' ,  '"+cardnumber+"', '"+pinnumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: " + pinnumber);

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource()==cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new SignUpThree("");
    }
}
