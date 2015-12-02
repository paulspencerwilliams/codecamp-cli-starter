package codecamp;

public class Till {
    private int amount = 0;
    private boolean oddCherries = false;
    public void scanApple() {
        amount += 100;
    }

    public void scanBanana() {
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
