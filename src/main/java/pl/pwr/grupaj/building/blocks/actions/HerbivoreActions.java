package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.simulation.SimulationMap;


import java.util.List;

public class HerbivoreActions implements Action {
    private final SimulationMap simulationMap;

    public HerbivoreActions(SimulationMap simulationMap) {
        this.simulationMap = new SimulationMap(simulationMap);
    }


    @Override
    public SimulationMap applyActions() {
        List<Element> herbivoreList = simulationMap.getMap().get(TypeOfElement.HERBIVORE);
        AnimalActions animalActions=new AnimalActions(simulationMap,TypeOfElement.HERBIVORE);

        for (Element herbivore : herbivoreList) {
            DistanceChecker distanceChecker = new DistanceChecker(simulationMap, herbivore);
            Element x; //variable x holds Element that is in range of animal performing action


            x = distanceChecker.hasPredatorInRange();
            if (x != null) {
                animalActions.run(herbivore, x);
                continue;
            }

            x = distanceChecker.hasScavengerInRange();
            if (x != null) {
                animalActions.run(herbivore, x);
                continue;
            }

            x= distanceChecker.hasHerbivoreInRange();
            if (x!=null){
                animalActions.goToPartner(herbivore,x);
                continue;
            }

            x= distanceChecker.hasBushInRange();
            if (x!=null){
                animalActions.goToFood(herbivore,x);
                continue;
            }
        }
        return animalActions.getUpdatedMap();
    }
}
