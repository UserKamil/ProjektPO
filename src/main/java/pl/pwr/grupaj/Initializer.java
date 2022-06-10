package pl.pwr.grupaj;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Initializer {
    private final static int mapFilling = (Map.getMapDimensions() * Map.getMapDimensions());

    public static void initialization() {
        Random random = new Random();
        List<Element> list = new ArrayList<>();
        for (int i = 0; i < 0.7 * mapFilling; i++) {
            int x = random.nextInt(Map.getMapDimensions());
            int y = random.nextInt(Map.getMapDimensions());
            for (Element n : list) {
                if (n.getX() == x || n.getY() == y)
                    i--;
                    break;
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
