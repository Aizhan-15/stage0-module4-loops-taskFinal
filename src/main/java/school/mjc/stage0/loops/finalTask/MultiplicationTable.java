package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int j;
        for (numberTableToPrint = 1; numberTableToPrint <= 10; numberTableToPrint++) {
            for (j = 1; numberTableToPrint <= 10; numberTableToPrint++) {
                System.out.print(numberTableToPrint * j + " ");
            }
            System.out.println();
        }
    }
}
