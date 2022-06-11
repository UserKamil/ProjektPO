package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building_blocks.Element;

import java.util.List;

public class Map {
    private static int mapDimensions;
    private static List<List<Element>> list;

    public static int getMapDimensions() {
        return mapDimensions;
    }

    public static void setMapDimensions(int mapDimensions) {
        Map.mapDimensions = mapDimensions;
    }

    public static List<List<Element>> getList() {
        return list;
    }

    public static void setList(List<List<Element>> list) {
        Map.list = list;
    }
}
