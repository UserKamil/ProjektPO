package pl.pwr.grupaj.simulation.printing;

public class PrintingToConsole{

    public void create(char[][] printableMap){
        for (char[] chars : printableMap) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
