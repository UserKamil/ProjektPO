package pl.pwr.grupaj.SimulationBuildingBlocks.Human;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Zoologist extends Human{
    private int x;
    private int y;
    @Override
    public int getMoveDistance() {
        return 5;
    }

    public Zoologist(int x, int y) {
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
