package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.simulation.Map;

import java.util.List;
import java.util.Random;

public class HerbivoreActions implements Action {


    @Override
    public void action(List<Element> listOfHerbivore) {

        for (int i =0; i<listOfHerbivore.size();i++) {
            Element herbivore=listOfHerbivore.get(i);
            if(HerbivoreNearPredatorAction(herbivore))
                continue;
            if(HerbivoreNearScavengerAction(herbivore))
                continue;
            if(HerbivoreNearHerbivoreAction(herbivore))
                continue;
            if(HerbivoreNearBushAction(herbivore))
                continue;
            HerbivoreNearNothingAction(herbivore);
        }
    }

    private void HerbivoreNearBushAction(Element herbivore) {

    }

    private void HerbivoreNearHerbivoreAction(Element herbivore,List<Element> listOfHerbivore) {
        herbivore.setX(secondHerbivore.getX());
        herbivore.setY(secondHerbivore.getY());
        listOfHerbivore.add(new Herbivore(herbivore.getX(), herbivore.getY()));
    }

    private void HerbivoreNearNothingAction(Element herbivore) {
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

    private void HerbivoreNearPredatorAction(Element herbivore) {

    }

    private void HerbivoreNearScavengerAction(Element herbivore) {


    }
}


