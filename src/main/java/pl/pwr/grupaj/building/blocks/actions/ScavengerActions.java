package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.simulation.SimulationMap;

import java.util.List;

public class ScavengerActions implements Action {
    private final SimulationMap simulationMap;

    public ScavengerActions(SimulationMap simulationMap) {
        this.simulationMap = simulationMap;
    }

    @Override
    public SimulationMap applyActions() {
        List<Element> scavengerList = simulationMap.getMap().get(TypeOfElement.SCAVENGER);
        AnimalActions animalActions = new AnimalActions(simulationMap, TypeOfElement.SCAVENGER);

        for (Element scavenger : scavengerList) {
            DistanceChecker distanceChecker = new DistanceChecker(simulationMap, scavenger);
            Element x; //variable x holds Element that is in range of animal performing action


            x = distanceChecker.hasPredatorInRange();
            if (x != null) {
                animalActions.run(scavenger, x);
                continue;
            }

            x = distanceChecker.hasScavengerInRange();
            if (x != null) {
                animalActions.goToPartner(scavenger, x);
                continue;
            }

            x = distanceChecker.hasDeadAnimalInRange();
            if (x != null) {
                animalActions.goToFood(scavenger, x);
                continue;
            }
        }
        return animalActions.getUpdatedMap();
    }
}
