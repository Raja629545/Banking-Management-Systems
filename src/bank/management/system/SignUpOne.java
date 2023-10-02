package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {

    long random;
    JTextField nametextfield, fnametextfield,dobtextfield,emailtextfield,addresstextfield,citytextfield,statetextfield,pintextfield;
    JButton next;
    JRadioButton male,female,others,married,unmarried;
    JDateChooser dateChooser;

    SignUpOne(){

        setLayout(null);

        Random ran=new Random();
        random=Math.abs(((ran.nextLong()) % 9000L)+1000L);

        JLabel formno=new JLabel("Application Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails=new JLabel("Page 1:Personal Details..");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,28));
        personalDetails.setBounds(240,80,400,35);
        add(personalDetails);

        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nametextfield=new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nametextfield.setBounds(300,140,400,30);
        add(nametextfield);

        JLabel fname=new JLabel("Father Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnametextfield=new JTextField();
        fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fnametextfield.setBounds(300,190,400,30);
        add(fnametextfield);

        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);


        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailtextfield=new JTextField();
        emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailtextfield.setBounds(300,340,400,30);
        add(emailtextfield);




        JLabel maritial=new JLabel("Maritial Status:");
        maritial.setFont(new Font("Raleway",Font.BOLD,20));
        maritial.setBounds(100,390,200,30);
        add(maritial);

        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        others=new JRadioButton("Others");
        others.setBounds(600,390,100,30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup maritialgroup=new ButtonGroup();
        maritialgroup.add(married);
        maritialgroup.add(unmarried);
        maritialgroup.add(others);





        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addresstextfield=new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addresstextfield.setBounds(300,440,400,30);
        add(addresstextfield);

        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(300,490,400,30);
        add(citytextfield);

        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(300,540,400,30);
        add(statetextfield);

        JLabel pin=new JLabel("Pincode:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        add(pin);

        pintextfield=new JTextField();
        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pintextfield.setBounds(300,590,400,30);
        add(pintextfield);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
         String formno=""+random;
         String name=nametextfield.getText();
         String fname=fnametextfield.getText();
         String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender=null;
         if(male.isSelected()){
             gender="Male";
         } else if (female.isSelected()) {
             gender="Female";
         }
         String email=emailtextfield.getText();
         String maritial=null;
         if (married.isSelected()){
             maritial="Married";
         } else if (unmarried.isSelected()) {
             maritial="Unmarried";
         } else if (others.isSelected()) {
             maritial="Other";
         }

        String address=addresstextfield.getText();
        String city=citytextfield.getText();
        String state=statetextfield.getText();
        String pin=pintextfield.getText();

        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }else {
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' ,'"+gender+"' , '"+email+"' , '"+maritial+"' , '"+address+"' , '"+city+"' , '"+state+"' , '"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignUpOne();
    }
}
