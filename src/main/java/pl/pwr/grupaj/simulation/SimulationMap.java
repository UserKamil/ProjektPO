package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building.blocks.Element;

import java.util.HashSet;
import java.util.Set;

public class SimulationMap {

  private final Set<CoordinateWithElement> coordinateWithElementSet = new HashSet<>();


  static class CoordinateWithElement {

    private final Coordinate coordinate;
    private final Element element;

    CoordinateWithElement(Coordinate coordinate, Element element) {
      this.coordinate = coordinate;
      this.element = element;
    }
  }
}
