package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Herbivore extends Animal {
    @Override
    public int getMoveDistance() {
        return 5;
    }
    private int x;
    private int y;
    public Herbivore(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public void action(Element classtype){

    }

    @Override
    void move() {


    }
}
