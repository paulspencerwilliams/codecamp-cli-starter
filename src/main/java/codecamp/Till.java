package codecamp;

public class Till {
    private int amount = 0;
    private boolean oddCherries = false;
    private boolean oddBananas = false;
    public void scanApple() {
        amount += 100;
    }

    public void scanBanana() {
        oddBananas = !oddBananas;
        if (oddBananas)
            amount += 150;
    }

    public void scanCherries() {
        oddCherries = !oddCherries;
        if (oddCherries)
            amount += 75;
        else
            amount += 55;
    }

    public int getAmount() {
        return amount;
    }
}

