package com.satesilka.stationeryshop.stationery.items;

import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.StationeryType;

public class Calculator extends Stationery {

    public Calculator(int price) {
        super(StationeryType.CALCULATOR, price);
    }
}
