package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;
import pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses.CheckDistance;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

import java.util.List;
import java.util.Random;

public class HerbivoreActions implements Action {


    @Override
    public void action(List<Element> listOfHerbivore) {
        boolean check=false;
        for (int i = 0; i < listOfHerbivore.size(); i++) {
            // TODO: 12.06.2022 dodac pozostale akcje KLASA NIEGOTOWA!
            Element herbivore = listOfHerbivore.get(i);
            for (Element predator : Map.getList().get(1)) { //Herbivore near Predator
                if (CheckDistance.checkDistanceBeetweenObjects(herbivore, predator) <= predator.getMoveDistance()) {
                    check=true;
                    break;
                }
            }
            if (check)
                continue;
            for (Element scavenger : Map.getList().get(1)) { //Herbivore near Scavenger
                if (CheckDistance.checkDistanceBeetweenObjects(herbivore, scavenger) <= scavenger.getMoveDistance()) {
                    check=true;
                    break;
                }
            }
            if (check)
                continue;
            for (Element secondHerbivore : Map.getList().get(0)) { //Herbivore near second Herbivore
                if (CheckDistance.checkDistanceBeetweenObjects(herbivore, secondHerbivore) <= herbivore.getMoveDistance() && CheckDistance.checkDistanceBeetweenObjects(herbivore, secondHerbivore) != 0) {
                    herbivore.setX(secondHerbivore.getX());
                    herbivore.setY(secondHerbivore.getY());
                    // TODO: 13.06.2022 JAK ZROBIC ZEBY SIE TAK MOCNO NIE MNOZYLY????
                    listOfHerbivore.add(new Herbivore(herbivore.getX(), herbivore.getY()));
                    check=true;
                    break;
                }
            }
            if (check)
                continue;
            for (Element bush : Map.getList().get(3)) { //Herbivore near bush
                if (CheckDistance.checkDistanceBeetweenObjects(herbivore, bush) <= herbivore.getMoveDistance()) {
                    //new HerbivoreNearBushAction().herbivoreNearBushAction(herbivore,bush);
                    check=true;
                    break;
                }
            }
            if (check)
                continue;
            Random random = new Random();
            int moveX = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
            int moveY = random.nextInt(2 * Herbivore.HERBIVORE_MOVE_DISTANCE) - Herbivore.HERBIVORE_MOVE_DISTANCE;
            if (Math.abs(moveX) + Math.abs(moveY) <= Herbivore.HERBIVORE_MOVE_DISTANCE && herbivore.getX() + moveX <= Map.getMapDimensions() &&
                    herbivore.getY() + moveY <= Map.getMapDimensions() && herbivore.getX() + moveX >= 0 && herbivore.getY() + moveY >= 0) {
                herbivore.setX(herbivore.getX() + moveX);
                herbivore.setY(herbivore.getY() + moveY);

            }
        }
    }

    private void HerbivoreNearBushAction() {

    }

    private void HerbivoreNearHerbivoreAction() {

    }

    private void HerbivoreNearNothingAction() {

    }

    private void HerbivoreNearPredatorAction() {

    }

    private void HerbivoreNearScavengerAction() {

    }
}


