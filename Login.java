import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login implements ActionListener {
   
    private static JLabel userLabel;
   
    private static JTextField userText;
   
    private static JLabel passLabel;
   
    private static JPasswordField passText;
   
    private static JButton loginButton;
   
    private static JLabel success;


    public static void main (String[]args){
        JPanel panel = new JPanel();
        JFrame loginFrame = new JFrame();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(500, 500);
        loginFrame.setVisible(false);
        loginFrame.setLayout(null);
        loginFrame.add(panel);
        
        userLabel = new JLabel("User :-");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        passLabel = new JLabel("Password :-");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);

        userText = new JTextField();
        userText.setBounds(80, 10, 150, 20);
        panel.add(userText);

        passText = new JPasswordField();
        passText.setBounds(80, 50, 150, 20);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 80, 80, 20);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new Login());
        panel.add(loginButton);

         success = new JLabel("");
        success.setBounds(10,150,150,50);
        panel.add(success);
         

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String user  = userText.getText();
    String password = passText.getText();
    System.out.println(user +" " + password);
    
    if (user.equals("sanket") && password.equals("1235446")){
        success.setText("Login Successfully");
        
    }
        
    }
}