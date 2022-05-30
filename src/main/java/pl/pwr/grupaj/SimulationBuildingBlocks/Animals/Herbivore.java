package pl.pwr.grupaj.SimulationBuildingBlocks.Animals;

import pl.pwr.grupaj.Simulation.Map.Map;
import pl.pwr.grupaj.SimulationBuildingBlocks.Element;

import java.util.Random;

public class Herbivore extends Animal {
    public Herbivore(int x, int y, int moveDistance) {
        super(x, y, moveDistance);
    }

    @Override
    public void action(Element classtype) {
        Random random = new Random();
        if (classtype instanceof Herbivore) {
            Map.getList().add(new Herbivore(classtype.getX(), classtype.getY(), classtype.getMoveDistance()));
        }
        if (classtype instanceof Predator || classtype instanceof Scavenger) {
            int a, b;
            do {
                a = random.nextInt(getMoveDistance() + 1) - getMoveDistance();
                b = random.nextInt(getMoveDistance() + 1) - getMoveDistance();
                setX(classtype.getX() + a);
                setY(classtype.getY() + b);
            }
            while (a + b != 5 && classtype.getX() + a < Map.getMapDimensions() && classtype.getY() + b < Map.getMapDimensions());
        }
    }

    @Override
    void move() {

    }
}
