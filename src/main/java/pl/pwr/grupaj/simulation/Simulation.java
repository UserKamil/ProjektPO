package pl.pwr.grupaj.simulation;

import pl.pwr.grupaj.building_blocks.Element;
import pl.pwr.grupaj.building_blocks.animal_actions.Action;
import pl.pwr.grupaj.building_blocks.animal_actions.PerformHerbivoreAction;
import pl.pwr.grupaj.building_blocks.animal_actions.PerformPredatorAction;
import pl.pwr.grupaj.building_blocks.animal_actions.PerformScavengerAction;
import pl.pwr.grupaj.simulation.printing.PrintableMap;
import pl.pwr.grupaj.simulation.printing.PrintingToConsole;
import pl.pwr.grupaj.simulation.printing.PrintingToFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simulation {

    private static int maxRounds;

    Simulation() {
        simulation();
    }


    public static void setMaxRounds(int maxRounds) {
        Simulation.maxRounds = maxRounds;
    }

    void simulation() {
        Initializer.initialization();
        List<Action> listOfActions = new ArrayList<>(Arrays.asList(new PerformHerbivoreAction(), new PerformPredatorAction(), new PerformScavengerAction()));
        List<List<Element>> listOfAnimals = new ArrayList<>(Arrays.asList(Map.getList().get(0), Map.getList().get(1), Map.getList().get(2)));
        PrintableMap printableMap=new PrintableMap();
        PrintingToConsole printingToConsole=new PrintingToConsole();
        PrintingToFile printingToFile = new PrintingToFile();
        printableMap.createPrintableMap();
        for (int i = 1; i <= maxRounds; i++) {
            for (List<Element> listOfSpecificAnimal : listOfAnimals) {
                for (Action action : listOfActions) {
                    for (Element animal : listOfSpecificAnimal) {
                        action.action(animal);
                    }
                }
            }
            printableMap.createPrintableMap();
            printingToConsole.print(printableMap.getPrintableMap());
            printingToFile.print(printableMap.getPrintableMap());
        }
    }
}
