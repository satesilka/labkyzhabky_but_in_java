package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.StationeryType;
import com.satesilka.stationeryshop.stationery.WritingSupplies;

public class Pencil extends WritingSupplies {

    public Pencil(int price) {
        super(StationeryType.PENCIL, price);
    }
}
