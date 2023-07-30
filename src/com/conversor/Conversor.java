package com.conversor;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conversor {
    private String option;
    private double amount;

    public Conversor() {
    }

    public Conversor(String option, double amount) {
        this.option = option;
        this.amount = amount;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String localToCurrency(double currency) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(this.amount / currency);
    }

    public String currencyToLocal(double currency) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(this.amount * currency);
    }
}
