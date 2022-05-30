package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;
import pl.pwr.grupaj.SimulationBuildingBlocks.NotMovingElements.DeadAnimal;


public class Predator extends Animal{


    public Predator(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public void action(Element NeighbourClass) {
        if (NeighbourClass instanceof Predator) {
            Map.getList().add(new Predator(NeighbourClass.getX(), NeighbourClass.getY(), NeighbourClass.getMoveDistance()));
        }
        if (NeighbourClass instanceof Herbivore) {
            Map.getList().add(new DeadAnimal(NeighbourClass.getX(),NeighbourClass.getY(),0));
            Map.getList().remove(NeighbourClass);
        }
        if (NeighbourClass instanceof Scavenger) {
            randomAction();
        }
    }
    @Override
    void move() {

    }
}
