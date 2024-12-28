package bank.config;

public class Config {

    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    public int getMinRequiredEarnings(){
        return minRequiredEarnings;
    }

    public double getPercentage(){
        return percentage;
    }
}
