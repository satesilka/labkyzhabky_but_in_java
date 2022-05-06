package com.satesilka.stationeryshop.managers;

import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.StationeryType;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class StationeryManager {
    private List<Stationery> items;

    public StationeryManager(List<Stationery> items) {
        this.items = items;
    }

    public List<Stationery> sortByPrice(SortingOrder order) {
        var comparator = Comparator.comparing(Stationery::getPrice);
        return items.stream().sorted(order == SortingOrder.ASC ? comparator : comparator.reversed()).collect(toList());
    }

    public List<Stationery> sortByType(SortingOrder order) {
        var comparator = Comparator.comparing(Stationery::getType);
        return items.stream().sorted(order == SortingOrder.ASC ? comparator : comparator.reversed()).collect(toList());
    }

    public List<Stationery> forYoungerStudent() {
       return items.stream().filter(stationery -> stationery.getType() == StationeryType.NOTEBOOK || stationery.getType() == StationeryType.PEN||stationery.getType() == StationeryType.PAINT).collect(toList());
    }

    public List<Stationery> forOlderStudent() {
        return items.stream().filter(stationery -> stationery.getType() == StationeryType.NOTEBOOK || stationery.getType() == StationeryType.PEN || stationery.getType() == StationeryType.CALCULATOR || stationery.getType() == StationeryType.PENCIL).collect(toList());
    }

    public List<Stationery> forUniversityStudent() {
        return items.stream().filter(stationery -> stationery.getType() != StationeryType.PAINT).collect(toList());
    }
}
