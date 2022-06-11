package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;

import java.util.List;
import java.util.Random;

public class HerbivoreNearHerbivoreAction {
    private List<Element> neighbours;

    public HerbivoreNearHerbivoreAction(List<Element> neighbours) {
        this.neighbours = neighbours;
    }

    public void herbivoreNearHerbivoreAction(Element herbivore) {
        Random random = new Random();
        for (Element animal : neighbours) {
            if (animal.getClass().isInstance(new Herbivore(-1, -1))) {
                herbivore.setX(animal.getX());
                herbivore.setY(animal.getY());
                new Herbivore(herbivore.getX(),herbivore.getY());
            }
        }
    }

}
