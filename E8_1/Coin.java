package E8_1;

public class Coin {
    private double coinValue;
    private String coinName;

    public Coin(double value, String name){
        coinValue = value;
        coinName = name;
    }

    public double getCoinValue(){
        return coinValue;
    }
}
