package app.Coins;

import app.Interfaces.Currency;

public class Bitcoin implements Currency {
    private int coinPrice = 2000;

    @Override
    public void changePrice() {

    }

    @Override
    public void showPrice() {

    }

    @Override
    public void showName() {
        System.out.println("Bitcoin");
    }
}
