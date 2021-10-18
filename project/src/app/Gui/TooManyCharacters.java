package app.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TooManyCharacters implements ActionListener {
    JFrame frame = new JFrame();
    JButton submitButton;

    public TooManyCharacters() {
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setTitle("Error | Crypto Simulator");
        ImageIcon icon = new ImageIcon("C:\\aToni\\Facultate - Anul II\\OOP\\Laboratoare\\Crypto-Simulator\\project\\src\\app\\Gui\\bitcoin-icon.png");
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(500, 150);
        frame.getContentPane().setBackground(new Color(39, 39, 39));

        JLabel usernameLabel = new JLabel();
        usernameLabel.setText("You had more than 16 characters! Try again.");
        usernameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        usernameLabel.setForeground(new Color(212, 170, 125));
        usernameLabel.setBounds(80, 5, 500, 80);


        submitButton = new JButton();
        submitButton.setText("Ok");
        submitButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        submitButton.setBackground(new Color(32, 129, 195));
        submitButton.setForeground(new Color(238, 238, 238));
        submitButton.setBounds(180, 70, 100, 30);
        submitButton.setFocusable(false);
        submitButton.addActionListener((ActionListener) this);

        frame.add(usernameLabel);
        frame.add(submitButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            frame.setVisible(false);
        }
    }
}
