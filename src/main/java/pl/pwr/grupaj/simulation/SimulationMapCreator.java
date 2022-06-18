package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building.blocks.Bush;
import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.building.blocks.animals.Herbivore;
import pl.pwr.grupaj.building.blocks.animals.Predator;
import pl.pwr.grupaj.building.blocks.animals.Scavenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SimulationMapCreator {

    private final int mapDimension;
    private final SimulationMap simulationMap;
    private int x,y;

    public SimulationMapCreator(int mapDimension) {
        this.mapDimension = mapDimension;
        this.simulationMap = new SimulationMap(mapDimension);
    }


    SimulationMap create() {


        int mapFilling = (int) Math.floor(0.5 * (simulationMap.getMapDimensions() * simulationMap.getMapDimensions()));
        Random random = new Random();
        for (TypeOfElement value : TypeOfElement.values()) {
            simulationMap.getMap().put(value, new ArrayList<>());
        }

        for (int i = 0; i < mapFilling; i++) {
            x = random.nextInt(simulationMap.getMapDimensions());
            y = random.nextInt(simulationMap.getMapDimensions());

            if (isDuplicate()) {
                i--;
                continue;
            }
            switch (random.nextInt(4)) {
                case 0 -> simulationMap.getMap().get(TypeOfElement.HERBIVORE).add(new Herbivore(x, y));
                case 1 -> simulationMap.getMap().get(TypeOfElement.PREDATOR).add(new Predator(x, y));
                case 2 -> simulationMap.getMap().get(TypeOfElement.SCAVENGER).add(new Scavenger(x, y));
                case 3 -> simulationMap.getMap().get(TypeOfElement.BUSH).add(new Bush(x, y));
            }
        }
        return simulationMap;
    }

    private boolean isDuplicate() {
        for (List<Element> n : simulationMap.getMap().values()) {
            for (Element element : n) {
                if (element.getX() == x && element.getY() == y) {
                    return true;
                }
            }
        }
        return false;
    }
}
