package test.com.satesilka.stationeryshop.stationery.managers;

import com.satesilka.stationeryshop.managers.SortingOrder;
import com.satesilka.stationeryshop.managers.StationeryManager;
import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.items.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StationeryManagerTest {
    static StationeryManager manager;

    @BeforeEach
    void initManager() {
        Stationery[] stationeries = {
                new Calculator(6),
                new Eraser(9),
                new Notebook(11),
                new Paint(30),
                new Pen(3),
                new Pencil(2),
                new Ruler(7)
        };

        manager = new StationeryManager(Arrays.asList(stationeries));
    }

    @Test
    public void testSortByPriceAsc() {
        List<Stationery> result = manager.sortByPrice(SortingOrder.ASC);
        int prevPrice = Integer.MIN_VALUE;
        for (Stationery stationery : result) {
            assertTrue(stationery.getPrice() >= prevPrice);
            prevPrice = stationery.getPrice();
        }
    }

    @Test
    public void testSortByPriceDesc() {
        List<Stationery> result = manager.sortByPrice(SortingOrder.DESC);
        int prevPrice = Integer.MAX_VALUE;
        for (Stationery stationery : result) {
            assertTrue(stationery.getPrice() <= prevPrice);
            prevPrice = stationery.getPrice();
        }
    }

    @Test
    public void testSortByTypeAsc() {
        List<Stationery> result = manager.sortByType(SortingOrder.ASC);
        int prevType = Integer.MIN_VALUE;
        for (Stationery stationery : result) {
            assertTrue(stationery.getType().ordinal() >= prevType);
            prevType = stationery.getType().ordinal();
        }
    }

    @Test
    public void testSortByTypeDesc() {
        List<Stationery> result = manager.sortByType(SortingOrder.DESC);
        int prevType = Integer.MAX_VALUE;
        for (Stationery stationery : result) {
            assertTrue(stationery.getType().ordinal() <= prevType);
            prevType = stationery.getType().ordinal();
        }
    }

    @Test
    public void testForYoungerStudent() {
        List<Stationery> result = manager.forYoungerStudent();
        Stationery[] expected = {
                new Notebook(11),
                new Paint(30),
                new Pen(3)
        };
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testForOlderStudent() {
        List<Stationery> result = manager.forOlderStudent();
        Stationery[] expected = {
                new Calculator(6),
                new Notebook(11),
                new Pen(3),
                new Pencil(2)
        };
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testForUniversityStudent() {
        List<Stationery> result = manager.forUniversityStudent();
        Stationery[] expected = {
                new Calculator(6),
                new Eraser(9),
                new Notebook(11),
                new Pen(3),
                new Pencil(2),
                new Ruler(7)
        };
        assertArrayEquals(expected, result.toArray());
    }

}

