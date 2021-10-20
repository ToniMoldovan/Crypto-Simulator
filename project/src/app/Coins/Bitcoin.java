package app.Coins;

import app.Classes.IncrementThread;
import app.Interfaces.Currency;
import java.util.Random;
import java.lang.Thread;

public class Bitcoin implements Currency {
    public static int coinPrice = 2000;
    private static Random rnd = new Random();
    private static Random rndBoolean = new Random();
    public static int numberGenerated;
    public static int randomBoolean;

    public Bitcoin() {
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
        return "Bitcoin";
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
