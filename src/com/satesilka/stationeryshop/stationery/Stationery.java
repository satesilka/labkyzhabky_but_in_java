package com.satesilka.stationeryshop.stationery;

public class Stationery {
    private StationeryType type;

    public Stationery(StationeryType type) {
        this.type = type;
    }

    public StationeryType getType() {
        return type;
    }

    public void setType(StationeryType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "type=" + type +
                '}';
    }
}
