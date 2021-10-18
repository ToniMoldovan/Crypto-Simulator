package app.Coins;

import app.Interfaces.Currency;

public class Etherum implements Currency {
    private int coinPrice = 1200;


    @Override
    public void changePrice() {

    }

    @Override
    public void showPrice() {

    }

    @Override
    public void showName() {
        System.out.println("Etherum");
    }
}
