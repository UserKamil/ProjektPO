package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

public class HerbivoreNearHerbivoreAction {


    public void herbivoreNearHerbivoreAction(Element herbivore, Element secondHerbivore) {
        herbivore.setX(secondHerbivore.getX());
        herbivore.setY(secondHerbivore.getY());
        Map.getList().get(0).add(new Herbivore(herbivore.getX(), herbivore.getY()));
    }
}

