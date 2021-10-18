package app.Classes;

import app.Coins.Bitcoin;
import app.Coins.Cardano;
import app.Coins.Etherum;
import app.Interfaces.Currency;

public class Main {
    public static void main(String[] args) {
        Currency btc = new Bitcoin();
        Currency eth = new Etherum();
        Currency ada = new Cardano();

        btc.showName();
        eth.showName();
        ada.showName();
    }
}
