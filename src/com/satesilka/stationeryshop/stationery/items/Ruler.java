package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.StationeryType;

public class Ruler extends Stationery {

    public Ruler(int price) {
        super(StationeryType.RULER, price);
    }
}
