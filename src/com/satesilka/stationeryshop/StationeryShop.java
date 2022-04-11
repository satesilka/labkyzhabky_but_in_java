package com.satesilka.stationeryshop;

import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.items.*;

public class StationeryShop {

    public static void main(String[] args) {
        Stationery[] stationeries = {
                new Calculator(),
                new Eraser(),
                new Notebook(),
                new Paint(),
                new Pen(),
                new Pencil(),
                new Ruler()
        };

        for (Stationery stationery : stationeries) {
            System.out.println(stationery);
        }
    }
}
