package pl.pwr.grupaj.building_blocks.animal_actions;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animals.Scavenger;
import pl.pwr.grupaj.simulation.Map;

import java.util.Random;

public class PerformScavengerAction implements Action {
    private Element scavenger;

    @Override
    public void action(Element animal) {
        this.scavenger = animal;
        if (ScavengerNearScavenger()) return;
        if (ScavengerNearDeadAnimal()) return;
        else ScavengerNearNothing();
    }

    private boolean ScavengerNearScavenger() {
        for (Element secondScavenger : Map.getList().get(Map.SCAVENGER_INDEX)) {
            if (CheckDistance.checkDistanceBeetweenObjects(scavenger, secondScavenger) <= scavenger.getMoveDistance()&& CheckDistance.checkDistanceBeetweenObjects(scavenger, secondScavenger)!=0) {
                Map.getList().get(Map.SCAVENGER_INDEX).add(new Scavenger(scavenger.getX(), scavenger.getY()));
                return true;
            }
        }
        return false;
    }
    private boolean ScavengerNearDeadAnimal(){
        for (Element deadAnimal : Map.getList().get(Map.DEAD_ANIMAL_INDEX)) { //Herbivore near bush
            if (CheckDistance.checkDistanceBeetweenObjects(scavenger, deadAnimal) <= scavenger.getMoveDistance()) {
                scavenger.setX(deadAnimal.getX());
                scavenger.setY(deadAnimal.getY());
                return true;
            }
        }
        return false;
    }

    private void ScavengerNearNothing() {
        Random random = new Random();
        int moveX;
        int moveY;

        do {
            moveX = random.nextInt(2 * scavenger.getMoveDistance() + 1) - scavenger.getMoveDistance();
            moveY = random.nextInt(2 * scavenger.getMoveDistance() + 1) - scavenger.getMoveDistance();
        }
        while (Math.abs(moveX) + Math.abs(moveY) > scavenger.getMoveDistance() && scavenger.getX() + moveX > Map.getMapDimensions() &&
                scavenger.getY() + moveY > Map.getMapDimensions() && scavenger.getX() + moveX < 0 && scavenger.getY() + moveY < 0);

        scavenger.setX(scavenger.getX() + moveX);
        scavenger.setY(scavenger.getY() + moveY);
    }
}