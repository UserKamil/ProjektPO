package pl.pwr.grupaj.simulation.printing;

import java.io.FileWriter;
import java.io.IOException;

public class PrintingToFile implements Print{

    @Override
    public void print(char[][] printableMap) {
        try {
            FileWriter myWriter = new FileWriter("SimulationOutput.txt");
            for (char[] chars : printableMap) {
                for (char c : chars) {
                    myWriter.write(c);
                }
                myWriter.write("/n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
