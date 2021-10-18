package app.Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome implements ActionListener {
    JFrame frame = new JFrame();

    JTextField usernameField;
    JButton submitButton;

    public Welcome(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome | Crypto Simulator");
        ImageIcon icon = new ImageIcon("C:\\aToni\\Facultate - Anul II\\OOP\\Laboratoare\\Crypto-Simulator\\project\\src\\app\\Gui\\bitcoin-icon.png");
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(340, 600);
        frame.getContentPane().setBackground(new Color(39, 39, 39));

        JLabel usernameLabel = new JLabel();
        usernameLabel.setText("Hello, sir! Enter your name.");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        usernameLabel.setForeground(new Color(212, 170, 125));
        usernameLabel.setBounds(45, 100, 340, 100);

        usernameField = new JTextField();
        usernameField.setBackground(new Color(75, 75, 75));
        usernameField.setForeground(new Color(212, 170, 125));
        usernameField.setHorizontalAlignment(JTextField.CENTER);
        usernameField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        usernameField.setBounds(60, 190, 200, 35);

        submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        submitButton.setBackground(new Color(32, 129, 195));
        submitButton.setForeground(new Color(238, 238, 238));
        submitButton.setBounds(110, 350, 100, 30);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);




        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(submitButton);
        frame.setVisible(true);
    }

    //When action is performed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("Welcome: " + usernameField.getText());
        }
    }
}
