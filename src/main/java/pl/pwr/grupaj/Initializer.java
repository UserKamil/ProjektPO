package pl.pwr.grupaj;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Initializer {
    private final static double mapFilling = Math.floor(0.7*(Map.getMapDimensions() * Map.getMapDimensions()));

    public static void initialization() {
        Random random = new Random();
        List<Element> helpingList = new ArrayList<>();
        List<Element> herbivore =new ArrayList<>();
        List<Element> predator =new ArrayList<>();
        List<Element> scavenger =new ArrayList<>();
        List<List<Element>> mainList =new ArrayList<>(Arrays.asList(herbivore,predator,scavenger));
        for (int i = 0; i < mapFilling; i++) {
            int x = random.nextInt(Map.getMapDimensions());
            int y = random.nextInt(Map.getMapDimensions());
            boolean check = false;
                for (Element n : helpingList) {
                    if (n.getX() == x && n.getY() == y) {
                        i--;
                        check=true;
                        break;
                    }
                }
                if (check){
                    continue;
                }

                switch (random.nextInt(3)) {
                    case 0:
                        helpingList.add(new Herbivore(x, y));
                        herbivore.add(new Herbivore(x, y));
                        break;
                    case 1:
                        helpingList.add(new Predator(x, y));
                        predator.add(new Predator(x, y));
                        break;
                    case 2:
                        helpingList.add(new Scavenger(x, y));
                        scavenger.add(new Scavenger(x, y));
                        break;
                }
            }
            Map.setList(mainList);
        }
    }
