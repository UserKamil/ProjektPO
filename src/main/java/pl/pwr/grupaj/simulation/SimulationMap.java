package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimulationMap {

    public SimulationMap(SimulationMap simulationMap) {
        Map<TypeOfElement, List<Element>> helpingMap = new HashMap<>();
        for (TypeOfElement value : TypeOfElement.values()) {
            List<Element> list = new ArrayList<>();
            for (Element element : simulationMap.getMap().get(value)) {
                list.add(element);
            }
            helpingMap.put(value, list);
        }
        this.map = helpingMap;
        this.mapDimensions = simulationMap.getMapDimensions();
    }

    public SimulationMap(int mapDimension) {
        map = new HashMap<>();
        this.mapDimensions = mapDimension;
    }

    public int getMapDimensions() {
        return mapDimensions;
    }

    public Map<TypeOfElement, List<Element>> getMap() {
        return map;
    }

    private final Map<TypeOfElement, List<Element>> map;

    private final int mapDimensions;
}
