package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Bush;
import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;

import java.util.List;
import java.util.Random;

public class HerbivoreNearBushAction {
    private List<Element> neighbours;
    private List<Element> listOfHerbivore;

    HerbivoreNearBushAction(List<Element> neighbours, List<Element> listOfHerbivore) {
        this.neighbours = neighbours;
        this.listOfHerbivore = listOfHerbivore;
    }

    public boolean herbivoreNearBushAction(Element herbivore) {
        for (Element animal : neighbours) {
            if (animal.getClass().isInstance(new Bush(-1, -1))) {
                herbivore.setX(animal.getX());
                herbivore.setY(animal.getY());
                return true;
            }
        }
        return false;
    }
}



