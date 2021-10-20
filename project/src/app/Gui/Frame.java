package app.Gui;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import app.Classes.User;
import app.Coins.*;
import app.Interfaces.Currency;

public class Frame {
    //Create the coins
    Currency BTC = new Bitcoin();
    Currency ETH = new Etherum();
    Currency ADA = new Cardano();

    //Create user
    User user;

    //Create the frame
    JFrame frame = new JFrame();

    //Name labels
    JLabel btcNameLabel = new JLabel(BTC.showName());
    JLabel ethNameLabel = new JLabel(ETH.showName());
    JLabel adaNameLabel = new JLabel(ADA.showName());

    JLabel btcPortofolioLabel = new JLabel("BTC");
    JLabel ethPortofolioLabel = new JLabel("ETH");
    JLabel adaPortofolioLabel = new JLabel("ADA");

    JLabel usernameLabel = new JLabel();
    JLabel currentMoneyLabel = new JLabel();
    JLabel profitLabel = new JLabel();

    //Price labels
    JLabel btcMarketPriceLabel = new JLabel();
    JLabel ethMarketPriceLabel = new JLabel();
    JLabel adaMarketPriceLabel = new JLabel();

    //Buttons
    JButton buyBTCButton = new JButton("BUY");
    JButton buyETHButton = new JButton("BUY");
    JButton buyADAButton = new JButton("BUY");

    JButton sellBTCButton = new JButton("SELL");
    JButton sellETHButton = new JButton("SELL");
    JButton sellADAButton = new JButton("SELL");

    public Frame(String username) throws IOException {
        user = new User(username);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Where the magic begins.. | Crypto Simulator");
        ImageIcon icon = new ImageIcon("C:\\aToni\\Facultate - Anul II\\OOP\\Laboratoare\\Crypto-Simulator\\project\\src\\app\\Gui\\bitcoin-icon.png");
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800, 660);
        frame.getContentPane().setBackground(new Color(39, 39, 39));

        JPanel marketPanel = new JPanel();
        marketPanel.setBounds(0, 0, 800, 330);
        marketPanel.setBackground(new Color(144, 169, 183));
        marketPanel.setLayout(null);

        btcNameLabel.setBounds(25, 60, 100, 30);
        btcNameLabel.setForeground(new Color(0, 0, 125));
        btcNameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        ethNameLabel.setBounds(25, 150, 100, 30);
        ethNameLabel.setForeground(new Color(0, 0, 125));
        ethNameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        adaNameLabel.setBounds(25, 250, 100, 30);
        adaNameLabel.setForeground(new Color(0, 0, 125));
        adaNameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        //PRICE BUTTONS
        btcMarketPriceLabel.setBounds(250, 60, 180, 30);
        btcMarketPriceLabel.setText(String.valueOf(BTC.showPrice()) + " USDT");
        btcMarketPriceLabel.setForeground(new Color(126, 0, 0));
        btcMarketPriceLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        ethMarketPriceLabel.setBounds(250, 150, 180, 30);
        ethMarketPriceLabel.setText(String.valueOf(ETH.showPrice()) + " USDT");
        ethMarketPriceLabel.setForeground(new Color(126, 0, 0));
        ethMarketPriceLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        adaMarketPriceLabel.setBounds(250, 250, 180, 30);
        adaMarketPriceLabel.setText(String.valueOf(ADA.showPrice()) + " USDT");
        adaMarketPriceLabel.setForeground(new Color(126, 0, 0));
        adaMarketPriceLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        //BUY BUTTONS
        buyBTCButton.setFocusable(false);
        buyBTCButton.setBounds(500, 60, 100, 30);
        buyBTCButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        buyBTCButton.setBackground(new Color(32, 129, 195));
        buyBTCButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        buyETHButton.setFocusable(false);
        buyETHButton.setBounds(500, 150, 100, 30);
        buyETHButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        buyETHButton.setBackground(new Color(32, 129, 195));
        buyETHButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        buyADAButton.setFocusable(false);
        buyADAButton.setBounds(500, 250, 100, 30);
        buyADAButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        buyADAButton.setBackground(new Color(32, 129, 195));
        buyADAButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        //SELL BUTTONS
        sellBTCButton.setFocusable(false);
        sellBTCButton.setBounds(650, 60, 100, 30);
        sellBTCButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        sellBTCButton.setBackground(new Color(32, 129, 195));
        sellBTCButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        sellETHButton.setFocusable(false);
        sellETHButton.setBounds(650, 150, 100, 30);
        sellETHButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        sellETHButton.setBackground(new Color(32, 129, 195));
        sellETHButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        sellADAButton.setFocusable(false);
        sellADAButton.setBounds(650, 250, 100, 30);
        sellADAButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        sellADAButton.setBackground(new Color(32, 129, 195));
        sellADAButton.setForeground(new Color(238, 238, 238));
        //Add actionListener!

        //Person image
        BufferedImage myPicture = ImageIO.read(new File("C:\\aToni\\Facultate - Anul II\\OOP\\Laboratoare\\Crypto-Simulator\\project\\src\\app\\Gui\\person.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setBounds(20, 370, 150, 190);

        //Username label
        usernameLabel.setText("Welcome, " + user.getUserName() + "!");
        usernameLabel.setBounds(25, 570, 200, 30);
        usernameLabel.setForeground(new Color(212, 170, 125));
        usernameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

        //Current money label
        currentMoneyLabel.setText("USDT: " + user.getUserMoney());
        currentMoneyLabel.setBounds(200, 450, 200, 30);
        currentMoneyLabel.setForeground(new Color(212, 170, 125));
        currentMoneyLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        //Profit label
        profitLabel.setText("PROFIT: " + user.getUserProfit());
        profitLabel.setBounds(200, 500, 200, 30);
        profitLabel.setForeground(new Color(212, 170, 125));
        profitLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        JPanel portofolioPanel = new JPanel();
        portofolioPanel.setBounds(380, 360, 380, 230);
        portofolioPanel.setBackground(new Color(110, 131, 135));
        portofolioPanel.setLayout(null);

        btcPortofolioLabel.setBounds(400, 400, 50, 40);
        btcPortofolioLabel.setForeground(new Color(212, 170, 125));
        btcPortofolioLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        ethPortofolioLabel.setBounds(400, 460, 50, 40);
        ethPortofolioLabel.setForeground(new Color(212, 170, 125));
        ethPortofolioLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

        adaPortofolioLabel.setBounds(400, 520, 50, 40);
        adaPortofolioLabel.setForeground(new Color(212, 170, 125));
        adaPortofolioLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));


        marketPanel.add(btcNameLabel);
        marketPanel.add(ethNameLabel);
        marketPanel.add(adaNameLabel);

        marketPanel.add(btcMarketPriceLabel);
        marketPanel.add(ethMarketPriceLabel);
        marketPanel.add(adaMarketPriceLabel);

        marketPanel.add(buyBTCButton);
        marketPanel.add(buyETHButton);
        marketPanel.add(buyADAButton);

        marketPanel.add(sellBTCButton);
        marketPanel.add(sellETHButton);
        marketPanel.add(sellADAButton);

        frame.add(btcPortofolioLabel);
        frame.add(ethPortofolioLabel);
        frame.add(adaPortofolioLabel);

        frame.add(currentMoneyLabel);
        frame.add(profitLabel);
        frame.add(usernameLabel);
        frame.add(picLabel);
        frame.add(marketPanel);
        frame.add(portofolioPanel);
        frame.setVisible(true);
    }


}
