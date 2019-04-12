package assignment7;

public enum Coin {
    penny(1,"copper"),
    dime(10,"silver"),
    nickel(5,"silver"),
    quarter(25,"silver");

    private int coinValue;
    private String coinColor;

    Coin(int coinValue, String coinColor) {
    this.coinColor = coinColor;
    this.coinValue = coinValue;
    }

    public int getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }

    public String getCoinColor() {
        return coinColor;
    }

    public void setCoinColor(String coinColor) {
        this.coinColor = coinColor;
    }
}
