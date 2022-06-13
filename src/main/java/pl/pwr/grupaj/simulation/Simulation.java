package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;
import pl.pwr.grupaj.building_blocks.animal_actions.herbivore.HerbivoreActions;
import pl.pwr.grupaj.building_blocks.animal_actions.predator.PredatorActions;
import pl.pwr.grupaj.building_blocks.animal_actions.scavenger.ScavengerActions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simulation {

    private static int maxRounds;

    Simulation() {
        simulation();
    }

    public static void setMaxRounds(int maxRounds) {
        Simulation.maxRounds = maxRounds;
    }

    void simulation() {
        Initializer.initialization();
        List<Action> listOfActions = new ArrayList<>(Arrays.asList(new HerbivoreActions(), new PredatorActions(), new ScavengerActions()));
        List<List<Element>> listOfAnimals = new ArrayList<>(Arrays.asList(Map.getList().get(0), Map.getList().get(1), Map.getList().get(2)));
        for (int i = 1; i <= maxRounds; i++) {
            for (List<Element> listOfSpecificAnimal : listOfAnimals) {
                for (Action action : listOfActions) {
                    action.action(listOfSpecificAnimal);
                }
            }
        }
    }
}
