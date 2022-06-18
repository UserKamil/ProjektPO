package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.simulation.SimulationMap;

import java.util.List;

public class PredatorActions {
    private final SimulationMap simulationMap;

    public PredatorActions(SimulationMap simulationMap) {
        this.simulationMap = simulationMap;
    }

    public SimulationMap applyActions() {
        List<Element> predatorList = simulationMap.getMap().get(TypeOfElement.PREDATOR);
        AnimalActions animalActions = new AnimalActions(simulationMap, TypeOfElement.PREDATOR);

        for (Element predator : predatorList) {
            DistanceChecker distanceChecker = new DistanceChecker(simulationMap, predator);
            Element x; //variable x holds Element that is in range of animal performing action


            x = distanceChecker.hasPredatorInRange();
            if (x != null) {
                animalActions.goToPartner(predator, x);
                continue;
            }

            x = distanceChecker.hasHerbivoreInRange();
            if (x != null) {
                animalActions.goToFood(predator, x);
                continue;
            }
        }
        return animalActions.getUpdatedMap();
    }

}