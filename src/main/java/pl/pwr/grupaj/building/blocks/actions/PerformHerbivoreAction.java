package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

import java.util.Random;

public class PerformHerbivoreAction implements Action {
    private Element herbivore;

    @Override
    public void action(Element animal) {
        this.herbivore = animal;
        if (HerbivoreNearPredator()) return;
        if (HerbivoreNearScavenger()) return;
        if (HerbivoreNearHerbivore()) return;
        if (HerbivoreNearBush()) return;
        else HerbivoreNearNothing();
    }


    private boolean HerbivoreNearBush() {
        for (Element bush : Map.getList().get(Map.BUSH_INDEX)) { //Herbivore near bush
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, bush) <= herbivore.getMoveDistance()) {
                herbivore.setX(bush.getX());
                herbivore.setY(bush.getY());
                return true;
            }
        }
        return false;
    }

    private boolean HerbivoreNearPredator() {
        for (Element predator : Map.getList().get(Map.PREDATOR_INDEX)) { //Herbivore near Predator
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, predator) <= predator.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }

    private boolean HerbivoreNearHerbivore() {
        for (Element secondHerbivore : Map.getList().get(Map.HERBIVORE_INDEX)) { //Herbivore near Herbivore
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, secondHerbivore) <= herbivore.getMoveDistance() && CheckDistance.checkDistanceBeetweenObjects(herbivore, secondHerbivore)!=0) {
                herbivore.setX(secondHerbivore.getX());
                herbivore.setY(secondHerbivore.getY());
                Map.getList().get(Map.HERBIVORE_INDEX).add(new Herbivore(herbivore.getX(), herbivore.getY()));
                return true;
            }
        }
        return false;
    }

    private boolean HerbivoreNearScavenger() {
        for (Element scavenger : Map.getList().get(Map.SCAVENGER_INDEX)) { //Herbivore near Scavenger
            if (CheckDistance.checkDistanceBeetweenObjects(herbivore, scavenger) <= scavenger.getMoveDistance()) {
                return true;
            }
        }
        return false;
    }

    private void HerbivoreNearNothing() {
        Random random = new Random();
        int moveX;
        int moveY;

        do {
            moveX = random.nextInt(2 * herbivore.getMoveDistance() + 1) - herbivore.getMoveDistance();
            moveY = random.nextInt(2 * herbivore.getMoveDistance() + 1) - herbivore.getMoveDistance();
        }
        while (Math.abs(moveX) + Math.abs(moveY) > herbivore.getMoveDistance() && herbivore.getX() + moveX > Map.getMapDimensions() &&
                herbivore.getY() + moveY > Map.getMapDimensions() && herbivore.getX() + moveX < 0 && herbivore.getY() + moveY < 0);

        herbivore.setX(herbivore.getX() + moveX);
        herbivore.setY(herbivore.getY() + moveY);
    }
}

