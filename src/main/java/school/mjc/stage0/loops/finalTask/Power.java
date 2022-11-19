package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        var sum = 1; //note that it's not zero!
        for (int i=0;i<numberToPrint;i++) { //loops n times
            sum = sum * power; //on each loop multiplies sum by base number
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
