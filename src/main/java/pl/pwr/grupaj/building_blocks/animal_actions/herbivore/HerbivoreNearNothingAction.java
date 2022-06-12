package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

import java.util.List;
import java.util.Random;

public class HerbivoreNearNothingAction {
    private List<Element> neighbours;
    List<Element> listOfHerbivore;

    public HerbivoreNearNothingAction(List<Element> neighbours, List<Element> listOfHerbivore) {
        this.neighbours = neighbours;
        this.listOfHerbivore = listOfHerbivore;
    }

    public boolean herbivoreNearNothingAction(Element herbivore) {
        Random random = new Random();
        int moveX, moveY;
        while (true) {
            moveX = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
            moveY = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
            if (Math.abs(moveX) + Math.abs(moveY) <= Herbivore.HERBIVORE_MOVE_DISTANCE && herbivore.getX() + moveX <= Map.getMapDimensions() &&
                    herbivore.getY() + moveY <= Map.getMapDimensions() && herbivore.getX() + moveX >= 0 && herbivore.getY() + moveY >= 0) {
                herbivore.setX(herbivore.getX() + moveX);
                herbivore.setY(herbivore.getY() + moveY);
                return true;
            }
        }
    }
}

