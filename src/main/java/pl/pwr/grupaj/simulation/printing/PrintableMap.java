package pl.pwr.grupaj.simulation.printing;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.building.blocks.TypeOfElement;
import pl.pwr.grupaj.simulation.SimulationMap;

public class PrintableMap {

    public char[][] getPrintableMap() {
        return printableMap;
    }

    private char[][] printableMap;

    public void create(SimulationMap simulationMap) {
        printableMap = new char[simulationMap.getMapDimensions()][simulationMap.getMapDimensions()];
        for (char[] chars : printableMap) {
            for (char aChar : chars) {
                aChar = '0';
            }
        }
        for (TypeOfElement value : TypeOfElement.values()) {
            for (Element element : simulationMap.getMap().get(value)) {
                printableMap[element.getX()][element.getY()] = element.getClass().getSimpleName().charAt(0);
            }
        }
    }
}
