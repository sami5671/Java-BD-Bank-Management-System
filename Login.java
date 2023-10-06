
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Login extends JFrame {
    Login(){  //its a constructor
        setTitle("BANGLADESH CENTRAL BANK");
        setLayout(null);
        // =========adding logo with position =========
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/log.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
    
        // =============set locaation of logo   ============= 
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

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);
        // label 3
        JLabel pin = new JLabel("PIN No: ");
        pin.setFont(new Font("Arial", Font.BOLD, 32));
        pin.setBounds(120, 220,700, 30);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);


        //added the button of Sign In and clear 
        JButton login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        add(login);

        //clear input field
        JButton clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        add(clear);
        //Added Sign up button
        JButton signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
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
    public static void main(String[] args) {
        new Login();
    }
}
