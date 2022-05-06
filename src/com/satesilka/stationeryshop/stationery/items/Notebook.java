package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.StationeryType;
import com.satesilka.stationeryshop.stationery.WritingSupplies;

public class Notebook extends WritingSupplies {

    public Notebook(int price) {
        super(StationeryType.NOTEBOOK, price);
    }
}
