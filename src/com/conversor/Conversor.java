package com.conversor;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conversor {
    private double amount;

    public Conversor() {
    }
    public Conversor(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String localToCurrency(double currency) {
//        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
//        return df.format(this.amount / currency);
        return df.format(Math.round(this.amount / currency));
    }
    public String currencyToLocal(double currency) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(Math.round(this.amount * currency));
    }
}
