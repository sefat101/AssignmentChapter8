package E8_2;

public class CashRegister {
    private double purchase;
    private double payment;

    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }

    public void receivePayment(int coinCount, Coin coinType)
    {
        payment = payment + coinCount * coinType.getCoinValue();
    }

    public int giveChange(Coin coinType) {
        double coinValue = coinType.getCoinValue();
        double change = payment - purchase;
        int numberOfCoins;

        numberOfCoins = (int) (change / coinValue);
        return numberOfCoins;
    }
}
