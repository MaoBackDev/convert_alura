package com.conversor;

public enum Currency {
    COP_DOLLAR(3990),
    COP_EURO(4050),
    COP_WOM(2900),
    COP_YEN(2570);

    private final double value;
    Currency(double value) {
        this.value = value;
    }

    public double getOption() {
        return value;
    }
}
