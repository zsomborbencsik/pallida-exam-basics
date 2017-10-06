public class CandyShop {
    int sugar;
    int money;
    int lollipops;
    int candies;
    Lollipop LOLLIPOP;
    Candies CANDY;

    public CandyShop(int sugarGramms) {
        this.sugar = sugarGramms;
        LOLLIPOP = new Lollipop();
        CANDY = new Candies();
    }
    public void createSweets(Sweets newSweets) {
        if (newSweets == CANDY) {
            candies++;
        } else {
            lollipops++;
        }
        this.sugar -= newSweets.sugar;
    }
    public void raise(int percent) {
        float percentage = 1.0f+(percent/100.0f);
        LOLLIPOP.setLollipopPrice((int) (LOLLIPOP.price * percentage));
        CANDY.setCandyPrice((int) (CANDY.price * percentage));
    }
    public void sell(Sweets sweets,int amount) {
        if (sweets == CANDY) {
            this.candies -= amount;
            this.money += CANDY.price * amount;
        } else {
            this.lollipops -= amount;
            this.money += LOLLIPOP.price * amount;
        }
    }
    public void buySugar(int sugarAmountBuy) {
        this.sugar += sugarAmountBuy;
    }
    public String printInventory() {
        String inventory = "Inventory: " + this.candies + " candies, " + this.lollipops + " lollipops, " + "Income: " + this.money + "$, " + "Sugar: "+ this.sugar;
        return inventory;
    }
}
