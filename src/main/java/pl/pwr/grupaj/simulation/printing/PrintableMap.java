package pl.pwr.grupaj.simulation.printing;

import pl.pwr.grupaj.building.blocks.Element;
import pl.pwr.grupaj.simulation.Map;

import java.util.List;

public class PrintableMap {

    public char[][] getPrintableMap() {
        return printableMap;
    }

    private char[][] printableMap=new char[Map.getMapDimensions()][Map.getMapDimensions()];

    public void createPrintableMap(){
        for (char[] chars : printableMap) {
            for (char aChar : chars) {
                aChar='0';
            }
        }

        for (List<Element> animalArray : Map.getList()) {
            for (Element animal : animalArray) {
                // TODO: 13.06.2022 jaki numerek dobrac tak by dobrze zbieral literke z nazwy klasy 
                printableMap[animal.getX()][animal.getY()]= animal.getClass().getSimpleName().charAt(0);
            }
        }
    }

}
