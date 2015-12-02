package codecamp;

public class Till {
    private int amount = 0;
    public void scanApple() {
        amount += 100;
    }

    public void scanBanana() {
        amount += 150;
    }

    public void scanCherries() {
        amount += 75;
    }

    public int getAmount() {
        return amount;
    }
}
