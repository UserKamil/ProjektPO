package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public abstract class Animal extends Element {
    public Animal(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    abstract void move();


}
