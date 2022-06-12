package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;
import pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses.CheckNeighbours;

import java.util.List;

public class HerbivoreActions implements Action {


    @Override
    public void action(List<Element> listOfHerbivore) {

        CheckNeighbours checkNeighbours = new CheckNeighbours();
        List<Element> neighbours;
        for (int i = 0; i < listOfHerbivore.size(); i++) {
            Element herbivore = listOfHerbivore.get(i);

            neighbours = checkNeighbours.checkNeighbours(herbivore);
            if (new HerbivoreNearPredatorAction(neighbours, listOfHerbivore).herbivoreNearPredatorAction(herbivore))
                continue;
            if (new HerbivoreNearHerbivoreAction(neighbours, listOfHerbivore).herbivoreNearHerbivoreAction(herbivore))
                continue;
            if (new HerbivoreNearNothingAction(neighbours, listOfHerbivore).herbivoreNearNothingAction(herbivore))
                continue;
            if (new HerbivoreNearBushAction(neighbours, listOfHerbivore).herbivoreNearBushAction(herbivore))
                continue;
        }
    }
}

