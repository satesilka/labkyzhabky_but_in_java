package test.com.satesilka.stationeryshop.stationery.managers;

import com.satesilka.stationeryshop.managers.StationeryWriter;
import com.satesilka.stationeryshop.stationery.Stationery;
import com.satesilka.stationeryshop.stationery.items.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class StationeryWriterTest {
    private static final String FILE = "result.csv";

    @Test
    void testWriteToFile() throws IOException {
        Stationery[] stationeries = {
                new Calculator(6),
                new Eraser(9),
                new Notebook(11),
                new Paint(30),
                new Pen(3),
                new Pencil(2),
                new Ruler(7)
        };
        StationeryWriter.writeToFile(FILE, Arrays.asList(stationeries));
        String result = Files.readString(Path.of(FILE));
        String expected = "Type,Price\nCALCULATOR,6\nERASER,9\nNOTEBOOK,11\nPAINT,30\nPEN,3\nPENCIL,2\nRULER,7\n";
        assertEquals(expected, result);
    }

    @Test
    void testWriteToFileEmpty() throws IOException {
        StationeryWriter.writeToFile(FILE, new ArrayList<>());
        String result = Files.readString(Path.of(FILE));
        String expected = "";
        assertEquals(expected, result);
    }
}
