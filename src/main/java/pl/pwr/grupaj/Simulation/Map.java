package pl.pwr.grupaj.Simulation;

import static java.lang.System.exit;

public class Map {
    private static int mapDimensions;
    private static Element[][] map;

    public static int getMapDimensions() {
        return mapDimensions;
    }

    public static Element[][] getMap() {
        return map;
    }

    //TODO zrobic mape zeby nie byla za mala
    Map(int mapDimensions) {
        if (mapDimensions < 5) {
            System.out.println("Map is too small! Please specify bigger map dimensions! ");
            exit(-1);
        }
        MapInitialization mapInitialization = new MapInitialization();
        Map.mapDimensions = mapDimensions;
        Map.map = new Element[mapDimensions][mapDimensions];
        mapInitialization.initialization();
    }
}
