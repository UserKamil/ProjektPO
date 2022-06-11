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

    public static List<List<Element>> getList() {
        return list;
    }

    public static void setList(List<List<Element>> list) {
        Map.list = list;
    }

    private static List<List<Element>> list;
}
