package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        var sum = 1;
        for (int i=0;i<numberToPrint;i++) {
            sum = sum * power;
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
