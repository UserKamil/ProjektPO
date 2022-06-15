package pl.pwr.grupaj.simulation.printing;

public class PrintingToConsole implements Print{
    @Override
    public void print(char[][] printableMap){
        for (char[] chars : printableMap) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
