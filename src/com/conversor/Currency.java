package com.conversor;

public enum Currency {
    COP_DOLLAR(3739.00),
    COP_EURO(4050.48),
    COP_WOM(29.68),
    COP_YEN(3.04),
    COP_LIB(4890.52);

    private final double value;
    Currency(double value) {
        this.value = value;
    }

    public double getOption() {
        return value;
    }
}
