package app.Coins;

import app.Classes.IncrementThread;
import app.Interfaces.Currency;
import java.util.Random;
import java.lang.Thread;

public class Etherum implements Currency {
    public static int coinPrice = 1200;
    private static Random rnd = new Random();
    private static Random rndBoolean = new Random();
    public static int numberGenerated;
    public static int randomBoolean;

    public Etherum() {
        IncrementThread myThread = new IncrementThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

    @Override
    public void changePrice() {

    }

    @Override
    public int showPrice() {
        return coinPrice;

    }

    @Override
    public String showName() {
        return "Etherum";
    }

    public static synchronized void modifyPrice(int generatedNumberFromThread) {
        numberGenerated = rnd.nextInt(50) + 1;
        randomBoolean = rnd.nextInt(2) + 1;

        if (randomBoolean == 1) { //Increment price
            coinPrice += generatedNumberFromThread + numberGenerated;
        }
        else {
            coinPrice -= generatedNumberFromThread + numberGenerated;
        }
    }
}
