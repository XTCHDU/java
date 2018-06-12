package com.xtc.www;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private int width = 17;

    private void printTietle() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    private void print(String name,int qty, double price){
        f.format("%-15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTietle();
        receipt.print("magic bean", 15, 100.151);
        receipt.print("yagao", 20, 12.3336);
        receipt.print("beizi", 17, 9.888);
    }
}
