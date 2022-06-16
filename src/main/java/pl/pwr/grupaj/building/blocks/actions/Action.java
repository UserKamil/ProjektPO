package pl.pwr.grupaj.building.blocks.actions;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.simulation.SimulationMap;

public interface Action {

  void apply(Element animal, SimulationMap map);

}
