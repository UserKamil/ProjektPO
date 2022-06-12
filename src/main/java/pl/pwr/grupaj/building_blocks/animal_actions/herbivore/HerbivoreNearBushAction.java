package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;


public class HerbivoreNearBushAction {

    public void herbivoreNearBushAction(Element herbivore,Element bush) {
                herbivore.setX(bush.getX());
                herbivore.setY(bush.getY());
        }
    }



