package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.DeadAnimal;
import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.building.blocks.animals.Herbivore;
import pl.pwr.grupaj.building.blocks.animals.Predator;
import pl.pwr.grupaj.building.blocks.animals.Scavenger;
import pl.pwr.grupaj.simulation.SimulationMap;

public class AnimalActions {
    private final SimulationMap simulationMap;
    private final TypeOfElement typeOfElement;

    public AnimalActions(SimulationMap simulationMap, TypeOfElement typeOfElement) {
        this.simulationMap = new SimulationMap(simulationMap);
        this.typeOfElement = typeOfElement;
    }

    public void run(Element animal, Element secondElement) {
        /*int x = animal.getX();
        switch (x / 2 > simulationMap.getMapDimensions()) {
            case
        }*/
    }

    public void goToPartner(Element animal, Element secondElement) {
        animal.setX(secondElement.getX());
        animal.setY(secondElement.getY());
        switch (typeOfElement) {
            case HERBIVORE ->
                    simulationMap.getMap().get(TypeOfElement.HERBIVORE).add(new Herbivore(animal.getX(), animal.getY()));
            case PREDATOR ->
                    simulationMap.getMap().get(TypeOfElement.PREDATOR).add(new Predator(animal.getX(), animal.getY()));
            case SCAVENGER ->
                    simulationMap.getMap().get(TypeOfElement.SCAVENGER).add(new Scavenger(animal.getX(), animal.getY()));
        }
    }

    public void goToFood(Element animal, Element secondElement) {
        animal.setX(secondElement.getX());
        animal.setY(secondElement.getY());
        switch (typeOfElement) {
            case HERBIVORE -> simulationMap.getMap().get(TypeOfElement.BUSH).remove(secondElement);
            case PREDATOR -> {
                simulationMap.getMap().get(TypeOfElement.DEAD_ANIMAL).add(new DeadAnimal(secondElement.getX(),secondElement.getY()));
                simulationMap.getMap().get(TypeOfElement.HERBIVORE).remove(secondElement);
            }
            case SCAVENGER -> simulationMap.getMap().get(TypeOfElement.DEAD_ANIMAL).remove(secondElement);
        }
    }

    public SimulationMap getUpdatedMap() {
        return simulationMap;
    }


}
