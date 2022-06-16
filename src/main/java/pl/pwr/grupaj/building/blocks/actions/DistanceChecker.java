package pl.pwr.grupaj.building.blocks.actions;


import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.simulation.SimulationMap;

public class DistanceChecker {

  private final SimulationMap simulationMap;
  private final Element animal;

  public DistanceChecker(SimulationMap simulationMap, Element animal) {
    this.simulationMap = simulationMap;
    this.animal = animal;
  }


  boolean hasPredatorInRadius(int radius) {
    return false; // check if distance to animal <= some given radius
  }
}
