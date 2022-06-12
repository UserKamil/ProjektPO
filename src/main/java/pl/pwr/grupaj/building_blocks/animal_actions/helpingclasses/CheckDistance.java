package pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses;

import pl.pwr.grupaj.building_blocks.Element;

public class CheckDistance {
    public static int checkDistanceBeetweenObjects(Element mainObject, Element secondaryObject){
        return Math.abs(mainObject.getX()- secondaryObject.getX())+Math.abs(mainObject.getY()- secondaryObject.getY());
    }

}
