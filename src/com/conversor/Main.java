package com.conversor;

import javax.swing.*;

public class Main {
    public static void showResult(double amount, String msg1, String value, String msg2) {
        JOptionPane.showMessageDialog(null, "$" + amount + " " + msg1 + " equivalen a: $" + value + " " + msg2);
    }
    public static int closeProgram() {
        return JOptionPane.showConfirmDialog(null,
                "Quieres continuar?",
                "Selcciona una opción...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String[] options = {"PESO_DOLLAR", "PESO_EURO", "PESO_WOM", "PESO_YEN", "DOLLAR_PESO", "EURO_PESO", "WOM_PESO", "YEN_PESO",};
        int flag = 0;
        while(flag == 0) {
            String opt = (String) JOptionPane.showInputDialog(null,
                    "\nSeleccione la opción de su preferencia\n", "Alura conversor de Divisas",
                    JOptionPane.PLAIN_MESSAGE, null, options, "COP-DOLAR");
            if(opt == null) break;

            String input = JOptionPane.showInputDialog(null,
                    "Ingresa la cantidad a convertir\n", "Alura conversor de Divisas", 1);

            if(input == null) break;
            double amount = Double.parseDouble(input);

            System.out.println(amount);
            Conversor cn = new Conversor(opt, amount);
            String value;
            switch (opt) {
                case "PESO_DOLLAR" -> {
                    value = cn.localToCurrency(Currency.COP_DOLLAR.getOption());
                    showResult(cn.getAmount(), "Pesos Colombianos", value, "Dolares");
                    flag = closeProgram();
                }
                case "PESO_EURO" -> {
                    value = cn.localToCurrency(Currency.COP_EURO.getOption());
                    showResult(cn.getAmount(), "Pesos Colombianos", value, "Euros");
                    flag = closeProgram();
                }
                case "PESO_WOM" -> {
                    value = cn.localToCurrency(Currency.COP_WOM.getOption());
                    showResult(cn.getAmount(), "Pesos Colombianos", value, "Woms");
                    flag = closeProgram();
                }
                case "PESO_YEN" -> {
                    value = cn.localToCurrency(Currency.COP_YEN.getOption());
                    showResult(cn.getAmount(), "Pesos Colombianos", value, "Yenes");
                    flag = closeProgram();
                }
                case "DOLLAR_PESO" -> {
                    value = cn.currencyToLocal(Currency.COP_DOLLAR.getOption());
                    showResult(cn.getAmount(), "Dolares", value, "Pesos Colombianos");
                    flag = closeProgram();
                }
                case "EURO_PESO" -> {
                    value = cn.currencyToLocal(Currency.COP_EURO.getOption());
                    showResult(cn.getAmount(), "Euros", value, "Pesos Colombianos");
                    flag = closeProgram();
                }
                case "WOM_PESO" -> {
                    value = cn.currencyToLocal(Currency.COP_WOM.getOption());
                    showResult(cn.getAmount(), "Woms", value, "Pesos Colombianos");
                    flag = closeProgram();
                }
                case "YEN_PESO" -> {
                    value = cn.currencyToLocal(Currency.COP_YEN.getOption());
                    showResult(cn.getAmount(), "Yenes", value, "Pesos Colombianos");
                    flag = closeProgram();
                }
                default -> {
                    System.out.println("Opción no válida");
                    flag = 1;
                }
            }
        }
    }
}