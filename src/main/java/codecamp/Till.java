package codecamp;

public class Till {
    private int amount = 0;
    private boolean oddCherries = false;
    private boolean oddBananas = false;
    private boolean oddMele = false;
    private int pommes;

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

    public void scanPommes() {
        pommes++;
        if (pommes%3 != 0)
        {
            amount+=100;
        }
    }

    public void scanMele() {
        oddMele = !oddMele;
        if (oddMele)
            amount += 100;
        else
            amount += 50;
    }
}


