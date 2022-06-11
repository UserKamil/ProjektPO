package pl.pwr.grupaj.building_blocks.animal_actions.helpingclasses;

import pl.pwr.grupaj.building_blocks.Element;

public class CheckVectorLength {
    public static double checkVectorLength(Element mainObject, Element secondaryObject){
        double vector = Math.sqrt(Math.pow(mainObject.getX() - secondaryObject.getX(), 2) + Math.pow(mainObject.getY() - secondaryObject.getY(), 2));
        return vector;
    }
}
