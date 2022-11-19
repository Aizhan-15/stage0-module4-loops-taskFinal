package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= numberTableToPrint; i++) {
            for (int j = 1; j <= numberTableToPrint; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
