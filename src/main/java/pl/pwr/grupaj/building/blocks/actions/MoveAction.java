package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.simulation.SimulationMap;

public class MoveAction implements Action { // sample actions

  @Override
  public void apply(Element animal, SimulationMap map) {
    DistanceChecker distanceChecker = new DistanceChecker(map, animal);

    if (distanceChecker.hasPredatorInRadius(20)) {
      // do something
    }
  }
}
