package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;

public class CheckDistance {
    public static int checkDistanceBeetweenObjects(Element mainObject, Element secondaryObject){
        return Math.abs(mainObject.getX()- secondaryObject.getX())+Math.abs(mainObject.getY()- secondaryObject.getY());
    }

}
