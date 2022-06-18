package pl.pwr.grupaj.building.blocks.actions;


import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.simulation.SimulationMap;

import java.util.List;

public class DistanceChecker {

    private final SimulationMap simulationMap;
    private final Element animal;
    private final int range;

    public DistanceChecker(SimulationMap simulationMap, Element animal) {
        this.simulationMap = simulationMap;
        this.animal = animal;
        this.range = animal.getMoveDistance();
    }


    Element hasPredatorInRange() {
        List<Element> predatorList = simulationMap.getMap().get(TypeOfElement.PREDATOR);
        for (Element predator : predatorList) {
            int distance = CheckDistance.between(animal, predator);
            if (distance <= range && distance!=0)
                return predator;
        }
        return null;
    }

    Element hasScavengerInRange() {
        List<Element> scavengerList = simulationMap.getMap().get(TypeOfElement.SCAVENGER);
        for (Element scavenger : scavengerList) {
            int distance = CheckDistance.between(animal, scavenger);
            if (distance <= range && distance!=0)
                return scavenger;
        }
        return null;
    }

    Element hasHerbivoreInRange() {
        List<Element> herbivoreList = simulationMap.getMap().get(TypeOfElement.HERBIVORE);
        for (Element herbivore : herbivoreList) {
            int distance = CheckDistance.between(animal, herbivore);
            if (distance <= range && distance!=0)
                return herbivore;
        }
        return null;
    }

    Element hasBushInRange() {
        List<Element> bushList = simulationMap.getMap().get(TypeOfElement.BUSH);
        for (Element bush : bushList) {
            if (CheckDistance.between(animal, bush) <= range)
                return bush;
        }
        return null;
    }

    Element hasDeadAnimalInRange() {
        List<Element> deadAnimalList = simulationMap.getMap().get(TypeOfElement.DEAD_ANIMAL);
        for (Element deadAnimal : deadAnimalList) {
            if (CheckDistance.between(animal, deadAnimal) <= range)
                return deadAnimal;
        }
        return null;
    }

    static class CheckDistance {
        public static int between(Element mainObject, Element secondaryObject) {
            return Math.abs(mainObject.getX() - secondaryObject.getX()) + Math.abs(mainObject.getY() - secondaryObject.getY());
        }
    }

}
