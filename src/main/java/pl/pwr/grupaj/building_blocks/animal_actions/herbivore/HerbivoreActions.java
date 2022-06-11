package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses.CheckNeighbours;
import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;

import java.util.List;

public class HerbivoreActions implements Action {
    @Override
    public void action(List<Element> listOfHerbivore) {
        for (Element herbivore : listOfHerbivore) {
            CheckNeighbours checkNeighbours = new CheckNeighbours();
            List<Element> neighbours = checkNeighbours.checkNeighbours(herbivore);
            if(new HerbivoreNearPredatorAction(neighbours).herbivoreNearPredatorAction(herbivore))
                continue;
        }
    }
}

