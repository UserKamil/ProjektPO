package pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.simulation.Map;

import java.util.ArrayList;
import java.util.List;

public class CheckNeighbours {
    public CheckNeighbours() {
    }
    List<Element> neighbourList=new ArrayList<>();
    public List<Element> checkNeighbours(Element someAnimal){
        for (List<Element> list: Map.getList()) {
            for (Element otherAnimal: list) {
                if(CheckVectorLength.checkVectorLength(someAnimal,otherAnimal)<=someAnimal.getMoveDistance())
                    neighbourList.add(otherAnimal);
            }
        }
        return neighbourList;
    }
}