package pl.pwr.grupaj;

import java.util.List;

public class Map {
    public static int getMapDimensions() {
        return mapDimensions;
    }
    public static void setMapDimensions(int mapDimensions) {
        Map.mapDimensions = mapDimensions;
    }
    private static int mapDimensions;

    public static List<Element> getList() {
        return list;
    }

    public static void setList(List<Element> list) {
        Map.list = list;
    }

    private static List<Element> list;
}
