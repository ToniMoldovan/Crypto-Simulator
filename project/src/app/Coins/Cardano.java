package app.Coins;

import app.Interfaces.Currency;

public class Cardano implements Currency {
    private int coinPrice = 900;


    @Override
    public void changePrice() {

    }

    @Override
    public void showPrice() {

    }

    @Override
    public void showName() {
        System.out.println("Cardano");
    }
}
