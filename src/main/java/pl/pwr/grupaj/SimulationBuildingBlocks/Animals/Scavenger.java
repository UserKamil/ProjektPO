package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

import java.util.Random;

public class Scavenger extends Animal{
    public Scavenger(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public void action(Element NeighbourClass){
        Random random = new Random();
        if (NeighbourClass instanceof Scavenger) {
            Map.getList().add(new Scavenger(NeighbourClass.getX(), NeighbourClass.getY(), NeighbourClass.getMoveDistance()));
        }
    }

    @Override
    void move() {

    }
}
