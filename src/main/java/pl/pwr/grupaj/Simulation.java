package pl.pwr.grupaj;

import java.util.ArrayList;
import java.util.List;

public class Simulation{
    public static void setMaxRounds(int maxRounds) {
        Simulation.maxRounds = maxRounds;
    }

    private static int maxRounds;
    List<Action> actions=new ArrayList<>();
    Simulation(){
        simulation();
    }

    void simulation(){
        Initializer.initialization();
    }
}
