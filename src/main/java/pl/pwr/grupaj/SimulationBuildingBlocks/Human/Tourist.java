package pl.pwr.grupaj.SimulationBuildingBlocks.Human;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Tourist extends Human{
    @Override
    public int getMoveDistance() {
        return 5;
    }
    private int x;
    private int y;
    public Tourist(int x, int y) {
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
