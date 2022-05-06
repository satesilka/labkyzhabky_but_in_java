package com.satesilka.stationeryshop.stationery;

public class Stationery {
    private StationeryType type;
    private int price;

    public Stationery(StationeryType type, int price) {
        this.type = type;
        this.price = price;
    }

    public StationeryType getType() {
        return type;
    }

    public void setType(StationeryType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHeaders() {
        return "Type,Price";
    }

    public String toCSV() {
        return type.name() + "," + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationery stationery = (Stationery) o;
        return type == stationery.type && price == stationery.price;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "type=" + type + "," +
                "price=" + price +
                '}';
    }
}
