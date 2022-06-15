package pl.pwr.grupaj.building_blocks.animal_actions;

import pl.pwr.grupaj.building_blocks.DeadAnimal;
import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

import java.util.Random;

public class PerformPredatorAction implements Action {
    private Element predator;

    @Override
    public void action(Element animal) {
        this.predator = animal;
        if (PredatorNearHerbivore()) return;
        if (PredatorNearPredator()) return;
        else PredatorNearNothing();
    }
    private boolean PredatorNearHerbivore() {
        for (Element herbivore : Map.getList().get(Map.HERBIVORE_INDEX)) { //Predator near bush
            if (CheckDistance.checkDistanceBeetweenObjects(predator, herbivore) <= predator.getMoveDistance()) {
                predator.setX(herbivore.getX());
                predator.setY(herbivore.getY());
                Map.getList().get(Map.DEAD_ANIMAL_INDEX).add(new DeadAnimal(herbivore.getX(),herbivore.getY()));
                Map.getList().get(Map.HERBIVORE_INDEX).remove(herbivore);
                return true;
            }
        }
        return false;
    }
    private boolean PredatorNearPredator() {
        for (Element secondPredator : Map.getList().get(Map.PREDATOR_INDEX)) { //Herbivore near Predator
            if (CheckDistance.checkDistanceBeetweenObjects(predator, secondPredator) <= predator.getMoveDistance()&& CheckDistance.checkDistanceBeetweenObjects(predator, secondPredator)!=0) {
                Map.getList().get(Map.HERBIVORE_INDEX).add(new Herbivore(predator.getX(), predator.getY()));
                return true;
            }
        }
        return false;
    }
    private void PredatorNearNothing() {
        Random random = new Random();
        int moveX;
        int moveY;

        do {
            moveX = random.nextInt(2 * predator.getMoveDistance() + 1) - predator.getMoveDistance();
            moveY = random.nextInt(2 * predator.getMoveDistance() + 1) - predator.getMoveDistance();
        }
        while (Math.abs(moveX) + Math.abs(moveY) > predator.getMoveDistance() && predator.getX() + moveX > Map.getMapDimensions() &&
                predator.getY() + moveY > Map.getMapDimensions() && predator.getX() + moveX < 0 && predator.getY() + moveY < 0);

        predator.setX(predator.getX() + moveX);
        predator.setY(predator.getY() + moveY);
    }


}

