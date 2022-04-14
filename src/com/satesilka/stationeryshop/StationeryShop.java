package com.satesilka.stationeryshop;

import com.satesilka.stationeryshop.managers.SortingOrder;
import com.satesilka.stationeryshop.managers.StationeryManager;
import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.items.*;

import java.util.Arrays;

public class StationeryShop {

    public static void main(String[] args) {
        Stationery[] stationeries = {
                new Calculator(6),
                new Eraser(9),
                new Notebook(11),
                new Paint(30),
                new Pen(3),
                new Pencil(2),
                new Ruler(7)
        };

        StationeryManager manager = new StationeryManager(Arrays.asList(stationeries));
        manager.sortByType(SortingOrder.ASC).forEach(System.out::println);

    }
}
