package com.satesilka.stationeryshop.managers;

import com.satesilka.stationeryshop.stationery.Stationery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public final class StationeryWriter {
    public static void writeToFile(String filename, List<Stationery> stationeries) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        if (stationeries.size() > 0) {
            fileWriter.write(stationeries.get(0).getHeaders() + "\n");
            for (Stationery stationery : stationeries) {
                fileWriter.write(stationery.toCSV() + "\n");
            }
        }
        fileWriter.close();
    }
}
