package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;

import java.util.List;
import java.util.Random;

public class HerbivoreNearHerbivoreAction {
    private List<Element> neighbours;

    public List<Element> getListOfHerbivore() {
        return listOfHerbivore;
    }

    private List<Element> listOfHerbivore;

    public HerbivoreNearHerbivoreAction(List<Element> neighbours,List<Element> listOfHerbivore) {
        this.neighbours = neighbours;
        this.listOfHerbivore=listOfHerbivore;
    }

    public boolean herbivoreNearHerbivoreAction(Element herbivore) {
        Random random = new Random();
        for (Element animal : neighbours) {
            if (animal.getClass().isInstance(new Herbivore(-1, -1))&& animal!=herbivore) {
                herbivore.setX(animal.getX());
                herbivore.setY(animal.getY());
                listOfHerbivore.add(new Herbivore(herbivore.getX(),herbivore.getY()));
                return true;
            }
        }
        return false;
    }
}
