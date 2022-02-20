package com.company;

public class Main {

    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            String symbol;
        if (row % 2 == 0)
            symbol = "-";
        else
            symbol = "*";

        for (int column = 1; column <= row; column++)
            System.out.print(symbol);
            System.out.println();
        }
    }
}