package pl.pwr.grupaj.SimulationBuildingBlocks.Human;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Herbivore;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Predator;
import pl.pwr.grupaj.SimulationBuildingBlocks.Animals.Scavenger;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.DeadAnimal;

public class Poacher extends Human{
    public Poacher(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public void action(Element NeighbourClass) {
        if (NeighbourClass instanceof Herbivore||NeighbourClass instanceof Predator || NeighbourClass instanceof Scavenger) {
            Map.getList().add(new DeadAnimal(NeighbourClass.getX(),NeighbourClass.getY(),0));
            Map.getList().remove(NeighbourClass);
        }
        randomAction();
    }


    @Override
    void move() {

    }
}
