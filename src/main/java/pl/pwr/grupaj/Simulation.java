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
        for (int i = 1; i <= maxRounds; i++) {
            for (Element n : Map.getList()) {
                for (Element m : Map.getList()) {
                    if (Math.sqrt(Math.pow(n.getX()-m.getX(),2)+Math.pow(n.getY()-m.getY(),2))>n.moveDistance){
                    }
                }
            }
        }
    }
}
// TODO: 10.06.2022 jak ogarnac movedistance dla klas skoro jedne sie ruszaja a drugie nie plus jak wsadzac do tablicy elementy nie ruszajace sie????? 
