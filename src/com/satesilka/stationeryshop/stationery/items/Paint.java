package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.StationeryType;

public class Paint extends Stationery {

    public Paint(int price) {
        super(StationeryType.PAINT, price);
    }
}
