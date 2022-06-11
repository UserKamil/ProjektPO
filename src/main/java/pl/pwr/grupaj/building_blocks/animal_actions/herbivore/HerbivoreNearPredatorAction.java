package pl.pwr.grupaj.building_blocks.animal_actions.herbivore;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.simulation.Map;
import pl.pwr.grupaj.building_blocks.animals.Herbivore;
import pl.pwr.grupaj.building_blocks.animals.Predator;

import java.util.List;
import java.util.Random;

public class HerbivoreNearPredatorAction {
    private List<Element> neighbours;
    public HerbivoreNearPredatorAction(List<Element> neighbours) {
        this.neighbours=neighbours;
    }
    public boolean herbivoreNearPredatorAction(Element herbivore){
        Random random=new Random();
        for (Element animal : neighbours) {
            if (animal.getClass().isInstance(new Predator(-1,-1))){
                int moveX,moveY;
                do {
                    moveX=random.nextInt((int)Math.ceil(Herbivore.HERBIVORE_MOVE_DISTANCE/2));
                    moveY=random.nextInt((int)Math.ceil(Herbivore.HERBIVORE_MOVE_DISTANCE/2));
                }
                while (moveX+moveY!=Herbivore.HERBIVORE_MOVE_DISTANCE);
                if (herbivore.getX()+moveX<= Map.getMapDimensions()-1)
                    animal.setX(herbivore.getX()+moveX);
                else
                    herbivore.setX(herbivore.getX()-moveX);

                if (herbivore.getY()+moveY<=Map.getMapDimensions()-1)
                    herbivore.setY(herbivore.getY()+moveY);
                else
                    herbivore.setY(herbivore.getY()-moveY);
                return true;
            }
        }
        return false;
    }
}
