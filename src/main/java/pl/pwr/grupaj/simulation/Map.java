package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building_blocks.Element;

import java.util.List;

public class Map {
    private static int mapDimensions;
    private static List<List<Element>> list;
    public static final int HERBIVORE_INDEX = 0;
    public static final int PREDATOR_INDEX = 1;
    public static final int SCAVENGER_INDEX = 2;
    public static final int BUSH_INDEX = 3;
    public static final int DEAD_ANIMAL_INDEX = 4;

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
