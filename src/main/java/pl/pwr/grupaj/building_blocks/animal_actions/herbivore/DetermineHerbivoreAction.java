package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses.CheckDistance;
import pl.pwr.grupaj.simulation.Map;

public class DetermineHerbivoreAction {
    Element herbivore;
    public DetermineHerbivoreAction(Element herbivore) {
        this.herbivore=herbivore;
    }

    public void determineHerbivoreAction(){

    }


    private boolean IsHerbivoreNearBush() {
        for (Element bush : Map.getList().get(3)) { //Herbivore near bush
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, bush) <= herbivore.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }

    private boolean IsHerbivoreNearPredator() {
        for (Element predator : Map.getList().get(1)) { //Herbivore near Predator
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, predator) <= predator.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }

    private boolean IsHerbivoreNearHerbivore() {
        for (Element secondHerbivore : Map.getList().get(0)) { //Herbivore near Herbivore
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, secondHerbivore) <= herbivore.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }

    private boolean IsHerbivoreNearScavengerAction() {
        for (Element scavenger : Map.getList().get(2)) { //Herbivore near Scavenger
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, scavenger) <= scavenger.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }
}

