package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses.CheckDistance;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.building_blocks.animals.Predator;
import pl.pwr.grupaj.simulation.Map;

import java.util.List;
import java.util.Random;

public class HerbivoreNearPredatorAction {
    private List<Element> neighbours;
    List<Element> listOfHerbivore;

    public HerbivoreNearPredatorAction(List<Element> neighbours, List<Element> listOfHerbivore) {
        this.neighbours = neighbours;
        this.listOfHerbivore = listOfHerbivore;
    }

    public boolean herbivoreNearPredatorAction(Element herbivore) {
        /*Random random = new Random();
        Predator predator = new Predator(-1, -1);
        for (Element animal : neighbours) {
            if (animal.getClass().isInstance(predator)) {
                while (true) {
                    int moveX, moveY;
                    do {
                        moveX = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
                        moveY = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
                    }
                    while (Math.abs(moveX) + Math.abs(moveY) != Herbivore.HERBIVORE_MOVE_DISTANCE);
                    if (herbivore.getX() + moveX > Map.getMapDimensions() - 1 || herbivore.getY() + moveY > Map.getMapDimensions() - 1){
                        int distanceBeetweenHerbivoreAndPredator= CheckDistance.checkDistanceBeetweenObjects(herbivore,animal);
                        if (distanceBeetweenHerbivoreAndPredator+ab)
                    }
                }
            }
        }*/
        return false;
    }
}
