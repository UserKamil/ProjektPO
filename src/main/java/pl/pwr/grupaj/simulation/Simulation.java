package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.building.blocks.actions.HerbivoreActions;
import pl.pwr.grupaj.building.blocks.actions.PredatorActions;
import pl.pwr.grupaj.building.blocks.actions.ScavengerActions;
import pl.pwr.grupaj.simulation.printing.PrintableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulation {

    private final int maxRounds;
    private SimulationMap simulationMap;

    public Simulation(int maxRounds, SimulationMap simulationMap) {
        this.maxRounds = maxRounds;
        this.simulationMap = simulationMap;
    }

    SimulationStats run() {

        HashMap<TypeOfElement, List<Element>> animals = generateAnimals();
        PrintableMap printableMap=new PrintableMap();


        for (int currentRound = 0; currentRound <= maxRounds; currentRound++) {
            for (TypeOfElement typeOfElement : animals.keySet()) {
                applyActions(typeOfElement);
            }
        }


        return null; // collect some stats along the way
    }

    private void applyActions(TypeOfElement typeOfElement) {
        switch (typeOfElement){
            case HERBIVORE -> simulationMap = new HerbivoreActions(simulationMap).applyActions();
            case PREDATOR -> simulationMap = new PredatorActions(simulationMap).applyActions();
            case SCAVENGER -> simulationMap = new ScavengerActions(simulationMap).applyActions();
        }
    }

    private HashMap<TypeOfElement, List<Element>> generateAnimals() {
        HashMap<TypeOfElement, List<Element>> animalsMap = new HashMap<>(Map.of(
                TypeOfElement.HERBIVORE, simulationMap.getMap().get(TypeOfElement.HERBIVORE),
                TypeOfElement.PREDATOR, simulationMap.getMap().get(TypeOfElement.PREDATOR),
                TypeOfElement.SCAVENGER, simulationMap.getMap().get(TypeOfElement.SCAVENGER)
        ));
        return animalsMap;
    }
}
