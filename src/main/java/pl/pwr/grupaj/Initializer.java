package pl.pwr.grupaj;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Initializer {
    private final static double mapFilling = Math.floor(0.7*(Map.getMapDimensions() * Map.getMapDimensions()));

    public static void initialization() {
        Random random = new Random();
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < mapFilling; i++) {
            int x = random.nextInt(Map.getMapDimensions());
            int y = random.nextInt(Map.getMapDimensions());
            boolean check = false;
                for (Element n : list) {
                    if (n.getX() == x && n.getY() == y) {
                        i--;
                        check=true;
                        break;
                    }
                }
                if (check==true){
                    continue;
                }

                switch (random.nextInt(3)) {
                    case 0:
                        list.add(new Herbivore(x, y));
                        break;
                    case 1:
                        list.add(new Predator(x, y));
                        break;
                    case 2:
                        list.add(new Scavenger(x, y));
                        break;
                }
            }
            Map.setList(list);
        }
    }
