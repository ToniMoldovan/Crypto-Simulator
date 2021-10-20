package app.Classes;
import app.Coins.*;
import app.Gui.Frame;
import app.Interfaces.Currency;
import java.util.Random;

public class IncrementThread implements Runnable{
    Random rnd = new Random();
    int randomNumber;

    public IncrementThread() {

    }

    @Override
    public void run() {
        while (true) {
            try{
                this.randomNumber = rnd.nextInt(100);
                Bitcoin.modifyPrice(randomNumber);
                Etherum.modifyPrice(randomNumber);
                Cardano.modifyPrice(randomNumber);
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
