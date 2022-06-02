package pl.pwr.grupaj.SimulationBuildingBlocks.Human;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public abstract class Human extends Element {
    public Human(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    abstract void move();
}
