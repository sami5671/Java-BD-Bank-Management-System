import java.awt.Color;
import java.awt.Font;
import java.util.Random;


import javax.swing.*;

public class Signup extends JFrame {

    Signup(){
    setLayout(null);
// ==============MAKE A RANDOM FORM NUMBER & show ON THE DISPLAY===================================
    Random ran = new Random();
    long randomNo = Math.abs((ran.nextLong() % 9000L) + 1000L);

    JLabel formNo = new JLabel("YOUR FROM NUMBER: " + randomNo);
    formNo.setFont(new Font("Arial", Font.BOLD, 35));
    formNo.setBounds(170, 20, 600, 40);
    add(formNo);
// ==============MAKE A RANDOM FORM NUMBER ===================================

// ===================PERSONAL DETAILS==============================
    //label 1
    JLabel personalDetails = new JLabel("Your Personal Details... ");
    personalDetails.setFont(new Font("Arial", Font.BOLD, 28));
    personalDetails.setBounds(280, 80, 400, 30);
    add(personalDetails);

    //label 2
    JLabel name = new JLabel("Name: ");
    name.setFont(new Font("Arial", Font.BOLD, 20));
    name.setBounds(100, 140, 100, 30);
    add(name);

    JTextField nameTextField = new JTextField();
    nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
    nameTextField.setBounds(300, 140, 400, 30);
    add(nameTextField);

    //label 3
    JLabel fname = new JLabel("Father's Name: ");
    fname.setFont(new Font("Arial", Font.BOLD, 20));
    fname.setBounds(100, 190, 200, 30);
    add(fname);

    JTextField fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
    fnameTextField.setBounds(300, 190, 400, 30);
    add(fnameTextField);

    //label 4
    JLabel dateOfBirth = new JLabel("Date Of Birth: ");
    dateOfBirth.setFont(new Font("Arial", Font.BOLD, 20));
    dateOfBirth.setBounds(100, 240, 200, 30);
    add(dateOfBirth);

    
    // dateChooser.setBounds(300, 240, 200, 30);
    // UtilDateModel model = new UtilDateModel();


    //label 5
    JLabel gender = new JLabel("Gender: ");
    gender.setFont(new Font("Arial", Font.BOLD, 20));
    gender.setBounds(100, 290, 200, 30);
    add(gender);

    JRadioButton male = new JRadioButton("Male");
    male.setBounds(300, 290, 60, 30);
    add(male);

    JRadioButton female = new JRadioButton("Female");
    female.setBounds(450, 290, 120, 30);
    add(female);

    // handle the gender selection 
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);

    //label 6
    JLabel email = new JLabel("Email: ");
    email.setFont(new Font("Arial", Font.BOLD, 20));
    email.setBounds(100, 340, 200, 30);
    add(email);

    JTextField emailTextField = new JTextField();
    emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
    emailTextField.setBounds(300, 340, 400, 30);
    add(emailTextField);

    //label 7
    JLabel maritalStatus = new JLabel("Marital Status: ");
    maritalStatus.setFont(new Font("Arial", Font.BOLD, 20));
    maritalStatus.setBounds(100, 390, 200, 30);
    add(maritalStatus);

    JRadioButton married = new JRadioButton("Married ");
    married.setBounds(300, 390, 100, 30);
    add(married);

    JRadioButton unmarried = new JRadioButton("Unmarried ");
    unmarried.setBounds(450, 390, 100, 30);
    add(unmarried);

    JRadioButton other = new JRadioButton("Others ");
    other.setBounds(630, 390, 100, 30);
    add(other);

    // handle the marital status selection 
    ButtonGroup maritalStatusGroup = new ButtonGroup();
    maritalStatusGroup.add(married);
    maritalStatusGroup.add(unmarried);
    maritalStatusGroup.add(other);
    
    //label 8
    JLabel address = new JLabel("Address: ");
    address.setFont(new Font("Arial", Font.BOLD, 20));
    address.setBounds(100, 440, 200, 30);
    add(address);

    JTextField addressTextField = new JTextField();
    addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
    addressTextField.setBounds(300, 440, 400, 30);
    add(addressTextField);

    //label 9
    JLabel city = new JLabel("City: ");
    city.setFont(new Font("Arial", Font.BOLD, 20));
    city.setBounds(100, 490, 200, 30);
    add(city);

    JTextField cityTextField = new JTextField();
    cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
    cityTextField.setBounds(300, 490, 400, 30);
    add(cityTextField);

    //label 10
    JLabel state = new JLabel("State: ");
    state.setFont(new Font("Arial", Font.BOLD, 20));
    state.setBounds(100, 540, 200, 30);
    add(state);

    JTextField stateTextField = new JTextField();
    stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
    stateTextField.setBounds(300, 540, 400, 30);
    add(stateTextField);

    //label 11
    JLabel pinCode = new JLabel("Pin Code: ");
    pinCode.setFont(new Font("Arial", Font.BOLD, 20));
    pinCode.setBounds(100, 590, 200, 30);
    add(pinCode);

    JTextField pinTextField = new JTextField();
    pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
    pinTextField.setBounds(300, 590, 400, 30);
    add(pinTextField);

    // button for go to next page
    JButton next = new JButton("Go to next page");
    next.setBounds(300, 660, 180, 30);
    add(next);
    // ===================PERSONAL DETAILS==============================

    // ===================background color==============================
    getContentPane().setBackground(Color.pink);
    // =================================================================
    // ======== adding height and width =========
    setSize(900, 680);
    setVisible(true);
    setLocation(350, 100);
    // ======== adding height and width =========
    }
   public static void main(String[] args) {
    new Signup();
   } 
}
