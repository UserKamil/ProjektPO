package pl.pwr.grupaj.Simulation.Map;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Map {
    private static int mapDimensions;
    private static Element[][] map;

    public static ArrayList<Element> getList() {
        return list;
    }

    private static ArrayList<Element> list= new ArrayList<>();
    public static int getMapDimensions() {
        return mapDimensions;
    }
    public static Element[][] getMap() {
        return map;
    }



    public Map(int mapDimensions) {
        if (mapDimensions < 5) {
            System.out.println("Map is too small! Please specify bigger map dimensions! ");
            exit(-1);
        }
        Map.mapDimensions = mapDimensions;
        MapInitialization mapInitialization = new MapInitialization();
        Map.map = mapInitialization.getMap();
        Map.list = mapInitialization.getlist();

    }
}
