package pl.pwr.grupaj.SimulationBuildingBlocks.Human;

import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

public class Tourist extends Human {
    public Tourist(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public void action(Element NeighbourClass) {
        if (NeighbourClass instanceof Tourist) {

        }
    }
        @Override
        void move () {

        }
    }
