import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    //==============GLOBAL DECLARATION OF BUTTONS and TEXT FIELDS==================
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //==============GLOBAL DECLARATION OF BUTTONS==================

    Login(){  //its a constructor
        setTitle("BANGLADESH CENTRAL BANK");
        setLayout(null);
        // =========adding logo with position =========
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/log.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
    
        // =============set location of logo   ============= 
        label.setBounds(70,10, 100, 100);
        add(label);
        // =========adding logo =========
        // =========================Creating label========================================

        // label 1
        JLabel text = new JLabel("WELCOME TO BANGLADESH BANK ATM");
        text.setFont(new Font("Arial", Font.BOLD, 32));
        text.setBounds(200, 40,700, 40);
        add(text);
        // label 2 
        JLabel cardNo = new JLabel("Card No: ");
        cardNo.setFont(new Font("Arial", Font.BOLD, 32));
        cardNo.setBounds(120, 150,700, 40);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(cardTextField);
        // label 3
        JLabel pin = new JLabel("PIN No: ");
        pin.setFont(new Font("Arial", Font.BOLD, 32));
        pin.setBounds(120, 220,700, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(pinTextField);


        //added the button of Sign In and clear 
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.addActionListener(this);
        add(login);

        //clear input field
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.addActionListener(this);
        add(clear);
        //Added Sign up button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.addActionListener(this);
        add(signup);
        //===========================Creating label=========================================================
        // ===================background color==============================
        getContentPane().setBackground(Color.PINK);
        // =================================================================
        // ======== adding height and width =========
        setSize(900, 580);
        setVisible(true);
        setLocation(350, 200);
         // ======== adding height and width =========
    }

    // =========================WHEN BUTTON WILL BE CLICKED THE ACTIONS WILL PERFORM IN THIS SECTION================================
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
        cardTextField.setText("");
        pinTextField.setText("");

        }else if (ae.getSource() == login) {
            
        }else if (ae.getSource() == signup) {
            
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
