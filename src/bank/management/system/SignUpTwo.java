package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {


    JTextField pantextfield,aadhartextfield;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox Religion,Category,Income,Education,Occupation;
    String formno;

    SignUpTwo(String formno){

        this.formno=formno;

        setLayout(null);

        setTitle("New application Form Page 2");



        JLabel additionalDetails=new JLabel("Page 2:Additional Details..");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,28));
        additionalDetails.setBounds(240,80,400,35);
        add(additionalDetails);



        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valRegion[]={"Hindu","Muslim","Sikh","Parsi","Christian","Others"};
        Religion =new JComboBox(valRegion);
        Religion.setFont(new Font("Raleway",Font.BOLD,14));
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);



        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valCategory[]={"General","OBC","ST","SC","Others"};
        Category =new JComboBox(valCategory);
        Category.setFont(new Font("Raleway",Font.BOLD,14));
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);




        JLabel income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);

        String IncomeCategory[]={"<10,000",">10,000 and <1,00,000",">1,00,000 and <2,00,000",">2,00,000 and <5,00,000","upto 10,00,00"};
        Income =new JComboBox(IncomeCategory);
        Income.setBounds(300,240,400,30);
        Income.setForeground(new Color(105,105,105));
        Income.setBackground(Color.WHITE);
        add(Income);




        JLabel gender=new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);


        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String EducationalValue[]={"Illetarate","Gradutation","Post Gradutation","Phd","MBA","Others"};
        Education =new JComboBox(EducationalValue);
        Education.setBounds(300,315,400,30);
        Education.setForeground(new Color(105,105,105));
        Education.setBackground(Color.WHITE);
        add(Education);





        JLabel maritial=new JLabel("Occupation:");
        maritial.setFont(new Font("Raleway",Font.BOLD,20));
        maritial.setBounds(100,390,200,30);
        add(maritial);

        String OccupationValue[]={"Salaried","Self-Employeed","Business","Student","Farmer","Others"};
        Occupation =new JComboBox(OccupationValue);
        Occupation.setBounds(300,390,400,30);
        Occupation.setForeground(new Color(105,105,105));
        Occupation.setBackground(Color.WHITE);
        add(Occupation);






        JLabel pan=new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        pantextfield=new JTextField();
        pantextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pantextfield.setBounds(300,440,400,30);
        add(pantextfield);




        JLabel aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);

        aadhartextfield=new JTextField();
        aadhartextfield.setFont(new Font("Raleway",Font.BOLD,14));
        aadhartextfield.setBounds(300,490,400,30);
        add(aadhartextfield);




        JLabel Citizen=new JLabel("Senior Citizen:");
        Citizen.setFont(new Font("Raleway",Font.BOLD,20));
        Citizen.setBounds(100,540,200,30);
        add(Citizen);

        syes=new JRadioButton("Yes");
        syes.setBounds(350,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno=new JRadioButton("No");
        sno.setBounds(500,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup citizengroup=new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);







        JLabel Account=new JLabel("Existing Account:");
        Account.setFont(new Font("Raleway",Font.BOLD,20));
        Account.setBounds(100,590,200,30);
        add(Account);

        eyes=new JRadioButton("Yes");
        eyes.setBounds(350,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno=new JRadioButton("No");
        eno.setBounds(500,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existinggroup=new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);








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
        String formno="";
        String Sreligion=(String) Religion.getSelectedItem();
        String Scategory=(String) Category.getSelectedItem();
        String Sincome=(String) Income.getSelectedItem();
        String Seducation=(String) Education.getSelectedItem();
        String Soccupation=(String) Occupation.getSelectedItem();

        String Citizen=null;
        if(syes.isSelected()){
            Citizen="Yes";
        } else if (sno.isSelected()) {
            Citizen="No";
        }



        String Account=null;
        if (syes.isSelected()){
            Account="Yes";
        } else if (sno.isSelected()) {
            Account="No";
        }

        String Span=pantextfield.getText();
        String Saadhar=aadhartextfield.getText();


        try{
                Conn c=new Conn();
                String query="insert into signupTwo values('"+formno+"' , '"+Sreligion+"' , '"+Scategory+"' , '"+Sincome+"' ,'"+Seducation+"'  , '"+Span+"' , '"+Saadhar+"' , '"+Citizen+"' , '"+Account+"' )";

                c.s.executeUpdate(query);

                //Create Object Of SignupThree

                setVisible(false);
                new SignUpThree(formno).setVisible(true);


        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignUpTwo("");
    }
}
