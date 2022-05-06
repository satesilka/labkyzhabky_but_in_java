package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.StationeryType;
import com.satesilka.stationeryshop.stationery.WritingSupplies;

public class Pen extends WritingSupplies {

    public Pen(int price) {
        super(StationeryType.PEN, price);
    }
}
