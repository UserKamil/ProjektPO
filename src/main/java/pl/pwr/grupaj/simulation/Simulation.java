package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.actions.Action;

import java.util.List;

public class Simulation {

  private final int maxRounds;
  private final SimulationMap map;
  private final List<Action> availableActions;

  public Simulation(int maxRounds, SimulationMap map, List<Action> actions) {
    this.maxRounds = maxRounds;
    this.map = map;
    this.availableActions = actions;
  }

  SimulationStats run() {

    List<Element> animals = generateAnimals(); // or pass in constuctor
    Initializer.initialization();

    for (int currentRound = 0; currentRound <= maxRounds; currentRound++) {
      for (Element animal : animals) {
        applyActions(animal);
      }
    }

    return null; // collect some stats along the way
  }

  private void applyActions(Element animal) {
    for (Action action : availableActions) {
      action.apply(animal, map);
    }
  }

  private List<Element> generateAnimals() {
    return null;
  }
}
